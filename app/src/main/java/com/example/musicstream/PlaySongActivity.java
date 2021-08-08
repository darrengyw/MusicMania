package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlaySongActivity extends AppCompatActivity {
    private String title = "";
    private String artist = "";
    private String filelink = "";
    private int drawable;
    private int currentIndex = -1;
    private MediaPlayer player = new MediaPlayer();
    private ImageButton btnPlayPause = null;
    private SongCollection songCollection = new SongCollection();
    SeekBar seekBar;
    Handler handler = new Handler();
    TextView FromTime; //start Songtime
    TextView ToTime; //Ending Songtime
    List<Song> shuffleList = Arrays.asList(songCollection.songs);
    ImageButton repeatbutton;
    ImageButton shufflebutton;
    Boolean repeatflag = false;
    Boolean shuffleflag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        Bundle songData = this.getIntent().getExtras();
        currentIndex = songData.getInt("index");
        btnPlayPause = findViewById(R.id.btnPlayPause);
        repeatbutton = findViewById(R.id.btnrepeat);
        shufflebutton =findViewById(R.id.btnshuffle);
        displaySongBasedOnIndex(currentIndex);
        playSong(filelink);
        FromTime = findViewById(R.id.fromtime);
        ToTime = findViewById(R.id.totime);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { //for seekbar
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //the song will play when left off
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //song touched when played
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                player.seekTo(seekBar.getProgress());//release to play song
            }
        });

    }
     Runnable playablebar = new Runnable() {
         @Override
         public void run() {
             if(player != null && player.isPlaying()) //play according to the song's duration length
             {
                 seekBar.setProgress(player.getCurrentPosition());
                 String fromtime = createtimer((player.getCurrentPosition()));
                 FromTime.setText((fromtime));
                 String totime = createtimer((player.getDuration()));
                 ToTime.setText((totime));
                 seekBar.setMax(player.getDuration());
                 handler.postDelayed(this, 1000);
             }
         }
     };

    public String createtimer(int duration)
    {
        String timer = "";
        int min = duration / 1000 /60;
        int sec = duration / 1000 % 60;
        timer += min + ":";
        if(sec < 10) timer += "0";
        timer += sec;
        return timer;
    }

    public void displaySongBasedOnIndex(int selectedIndex){
        Song song = songCollection.getCurrentSong(currentIndex);
        title = song.getTitle();
        artist = song.getArtiste();
        filelink = song.getFileLink();
        drawable = song.getDrawable();
        TextView txtTitle = findViewById(R.id.txtSongtitle);
        txtTitle.setText(title);
        TextView txtArtiste = findViewById(R.id.txtArtist);
        txtArtiste.setText(artist);
        ImageView imageView = findViewById(R.id.imageview);
        imageView.setImageResource(drawable);

    }
    public void playSong(String songUrl){
        try {
            player.reset();
            player.setDataSource(songUrl);
            player.prepare();
            handler.removeCallbacks(playablebar);
            handler.postDelayed(playablebar,0);
            player.start();
            gracefullyStopsWhenMusicEnds();
            btnPlayPause.setImageResource(R.drawable.pause);
            btnPlayPause.setImageResource(R.drawable.play);
            setTitle(title);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void playOrPauseMusic(View view){
        if(!player.isPlaying()) {
            player.start();
            handler.removeCallbacks(playablebar);
            handler.postDelayed(playablebar,0);
            ;
            btnPlayPause.setImageResource(R.drawable.play);
        } else {
            pauseMusic();
        }
    }

    private void pauseMusic()
    {
        player.pause();
        btnPlayPause.setImageResource(R.drawable.pause);
        handler.postDelayed(playablebar,0);
    }

    public void repeatSong(View view)
    {
        if(repeatflag)
        {
            repeatbutton.setImageResource(R.drawable.repeat__off_); //play song once the repeat button is toggle off
        }else
        {
            repeatbutton.setImageResource(R.drawable.repeat__on_); //repeat song once the repeat button is toggle on
        }
        repeatflag = !repeatflag;
    }

    public void shuffleSong(View view)
    {
        if(shuffleflag)
        {
            shufflebutton.setImageResource(R.drawable.shuffle__off_);//shuffle song once the shuffle button is toggle off
            songCollection = new SongCollection();
        }else
        {
            shufflebutton.setImageResource(R.drawable.shuffle_on_); //shuffle song once the shuffle button is toggle on
            Collections.shuffle(shuffleList); //collect songs to shuffle
            shuffleList.toArray(songCollection.songs); //shuffle songs on what is in the array
        }
        shuffleflag = !shuffleflag;
    }

    private void gracefullyStopsWhenMusicEnds(){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                if(repeatflag)
                {
                    playOrPauseMusic(null);
                }
                else
                {
                    btnPlayPause.setImageResource(R.drawable.pause);
                    playNext(null); //play next song
                }
            }
        });
    }
    public void playNext(View view){ //play next song
        currentIndex = songCollection.getNextSong(currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(filelink);
    }public void playPrevious(View view){ //play prev song
        currentIndex = songCollection.getPrevSong(currentIndex);
        displaySongBasedOnIndex(currentIndex);
        playSong(filelink);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        player.release();
        handler.removeCallbacks(playablebar);
    }
}