package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GenreSongActivity extends AppCompatActivity {
    private RecyclerView grecycleview;
    private RecyclerView.Adapter gAdapter;
    private RecyclerView.LayoutManager glayoutManager;
    GenreCollection genreCollection = new GenreCollection();
    GenreSongCollection genreSongCollection = new GenreSongCollection();
    //genresongcolumn recycleview variable
    private List<GenreSong> genreSongList;
    ImageView GenreCover;
    TextView GenreName;
    int displaygenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_song);
        Bundle genresong = this.getIntent().getExtras();
        displaygenre = genresong.getInt("index");
        genreSongList = genreSongCollection.genresong.get(displaygenre);
        GenreCover = findViewById(R.id.genreview);
        GenreName = findViewById(R.id.genrename);

        grecycleview = findViewById(R.id.genresongrecycleview);
        grecycleview.setHasFixedSize(true);
        glayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        grecycleview.setLayoutManager(glayoutManager);
        gAdapter = new GenreSongRecycleView(genreSongList, this);
        grecycleview.setAdapter(gAdapter);
        //genresongcolumn recycleview
        displaygenreview();

    }
    public void displaygenreview()
    {
        GenreCover.setImageResource(genreCollection.getGenre().get(displaygenre).getDrawable());
        GenreName.setText((genreCollection.getGenre().get(displaygenre).getGenretitle()));
    }

}