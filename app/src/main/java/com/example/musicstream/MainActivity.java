package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView srecyclerView;
    private RecyclerView.Adapter sAdapter;
    private RecyclerView.LayoutManager slayoutManager;
    SongCollection songCollection = new SongCollection();
    List<Song> songList = songCollection.getSongtrack();
    //songcolumn recycleview variable

    private RecyclerView arecycleview;
    private RecyclerView.Adapter aAdapter;
    private RecyclerView.LayoutManager alayoutManager;
    ArtistCollection artistCollection = new ArtistCollection();
    List<Artist> artistList = artistCollection.getArtist();
    //artistcolumn recycleview variable

    private RecyclerView grecycleview;
    private RecyclerView.Adapter gAdapter;
    private RecyclerView.LayoutManager glayoutManager;
    GenreCollection genreCollection = new GenreCollection();
    List<Genre> genreList = genreCollection.getGenre();
    //genrecolumn recycleview variable



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView searchbutton = (ImageView) findViewById(R.id.btnSearch);
        final Context context = this;
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchpage = new Intent(context, SearchPageActivity.class); //Go to Search Page
                startActivity(searchpage);
            }
        });
        srecyclerView = findViewById(R.id.recyclerView1);
        srecyclerView.setHasFixedSize(true);
        slayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        srecyclerView.setLayoutManager(slayoutManager);
        sAdapter = new SongRecycleView(songList, this);
        srecyclerView.setAdapter(sAdapter);
        //songcolumn recycleview

        arecycleview = findViewById(R.id.recyclerView2);
        arecycleview.setHasFixedSize(true);
        alayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        arecycleview.setLayoutManager(alayoutManager);
        aAdapter = new ArtistRecycleView(artistList, this);
        arecycleview.setAdapter(aAdapter);
        //artistcolumn recycleview

        grecycleview = findViewById(R.id.recyclerView3);
        grecycleview.setHasFixedSize(true);
        glayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        grecycleview.setLayoutManager(glayoutManager);
        gAdapter = new GenreRecycleView(genreList, this);
        grecycleview.setAdapter(gAdapter);
        //genrecolumn recycleview

    }
}