package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SearchPageActivity extends AppCompatActivity {
    private RecyclerView searchrecycleview;
    private RecyclerView.Adapter searchAdapter;
    private RecyclerView.LayoutManager searchlayoutManager;
    SongCollection songCollection = new SongCollection();
    List<Song> songList = songCollection.getSongtrack();
    ImageView SearchArtistCover;
    TextView SearchArtistName;
    TextView SearchSongName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        searchrecycleview = findViewById(R.id.searchrecycleview);
        searchrecycleview.setHasFixedSize(true);
        searchlayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        searchrecycleview.setLayoutManager(searchlayoutManager);
        searchAdapter = new SearchRecycleView(songList,this);
        searchrecycleview.setAdapter(searchAdapter);
    }
}