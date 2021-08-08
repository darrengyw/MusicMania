package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

import java.util.List;

public class ArtistSongActivity extends AppCompatActivity {
    private RecyclerView asrecycleview;
    private RecyclerView.Adapter asAdapter;
    private RecyclerView.LayoutManager aslayoutManager;
    ArtistCollection artistCollection = new ArtistCollection();
    ArtistSongCollection artistSongCollection = new ArtistSongCollection();
    //artistsongcolumn recycleview variable
    private List<ArtistSong> artistSongList;
    ImageView ArtistCover;
    TextView ArtistName;
    int displayartist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistsong);
        Bundle artistsong = this.getIntent().getExtras();
        displayartist = artistsong.getInt("index"); //passing information into the recycleview
        artistSongList = artistSongCollection.artistsong.get(displayartist);
        //Display each artist's songs in the recycleview according to the artist image
        ArtistCover = findViewById(R.id.artistview);
        ArtistName = findViewById(R.id.artistname);
        asrecycleview = findViewById(R.id.artistsongrecycleview);
        asrecycleview.setHasFixedSize(true);
        aslayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        asrecycleview.setLayoutManager(aslayoutManager);
        asAdapter = new ArtistSongRecycleView(artistSongList ,this);
        asrecycleview.setAdapter(asAdapter);
        //artistsongcolumn recycleview
        displayartistimage();//Method show below

    }

    public void displayartistimage()//Displaying artist image and artist name in ArtistSongActivity
    {
        ArtistCover.setImageResource(artistCollection.getArtist().get(displayartist).getDrawable());
        ArtistName.setText((artistCollection.getArtist().get(displayartist).getTitle()));
    }

}