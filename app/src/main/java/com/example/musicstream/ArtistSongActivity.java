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
    GenreCollection genreCollection = new GenreCollection();
    ArtistSongCollection artistSongCollection = new ArtistSongCollection();
    //GenreSongCollection genreSongCollection = new GenreSongCollection();
    //artistsongcolumn recycleview variable
    private List<ArtistSong> artistSongList;
    //private List<GenreSong> genreSongList;
    ImageView ArtistCover;
    TextView ArtistName;

    ImageView GenreCover;
    TextView GenreName;
    int displayartist;
    int displaygenre;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistsong);
        Bundle artistsong = this.getIntent().getExtras();
        displayartist = artistsong.getInt("index");
        artistSongList = artistSongCollection.artistsong.get(displayartist);
        Bundle genresong = this.getIntent().getExtras();
        //displaygenre= genresong.getInt("displaygenre");
        //genreSongList = genreSongCollection.genresong.get(displaygenre);
        ArtistCover = findViewById(R.id.artistview);
        ArtistName =findViewById(R.id.artistname);

        GenreCover = findViewById(R.id.artistview);
        GenreName = findViewById(R.id.artistname);
        asrecycleview = findViewById(R.id.artistsongrecycleview);
        asrecycleview.setHasFixedSize(true);
        aslayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        asrecycleview.setLayoutManager(aslayoutManager);
        asAdapter = new ArtistSongRecycleView(artistSongList ,this);
        asrecycleview.setAdapter(asAdapter);
        //artistsongcolumn recycleview
        displayartistimage();
        displaygenreimage();
    }

    public void displayartistimage()
    {
        ArtistCover.setImageResource(artistCollection.getArtist().get(displayartist).getDrawable());
        ArtistName.setText((artistCollection.getArtist().get(displayartist).getTitle()));
    }
   public void displaygenreimage()
    {
        ArtistCover.setImageResource(genreCollection.getGenreList().get(displaygenre).getDrawable());
        ArtistName.setText(genreCollection.getGenreList().get(displaygenre).getGenretitle());
    }
}