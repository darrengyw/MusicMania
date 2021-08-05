package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SearchPageActivity extends AppCompatActivity {
    private RecyclerView searchrecycleview;
    private SearchRecycleView searchAdapter;
    private RecyclerView.LayoutManager searchlayoutManager;
    SongCollection songCollection = new SongCollection();
    List<Song> songList = songCollection.getSongtrack();
    int searchartistsong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        Bundle searchsong = this.getIntent().getExtras();
        searchartistsong = searchsong.getInt("index");
        EditText editText = findViewById(R.id.searchtext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
        searchrecycleview = findViewById(R.id.searchrecycleview);
        searchrecycleview.setHasFixedSize(true);
        searchlayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        searchrecycleview.setLayoutManager(searchlayoutManager);
        searchAdapter = new SearchRecycleView(songList,this);
        searchrecycleview.setAdapter(searchAdapter);
    }

    private void filter(String text)
    {
        ArrayList<Song> searchedList = new ArrayList<>();
        for(Song songitem: songList)
        {
            if(songitem.getTitle().toLowerCase().contains(text.toLowerCase()))
            {
                searchedList.add(songitem);
            }
        }
        searchAdapter.searchedList(searchedList);

    }


}