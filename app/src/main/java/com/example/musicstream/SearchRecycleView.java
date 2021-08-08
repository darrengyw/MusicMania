package com.example.musicstream;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchRecycleView extends RecyclerView.Adapter<SearchRecycleView.MyViewHolder> {
    //Recycleview for Search
    SongCollection songCollection = new SongCollection(); //Getting the SongArray from SongCollection
    List<Song> songList; //Getting song from SongCollection
    Context context;
    public SearchRecycleView(List<Song> songList, Context context)
    {
        this.songList = songList;
        this.context = context;
    }
    @NonNull
    @Override
    public SearchRecycleView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_recycleviewlayout,parent,false);
        //Displaying the search song array in the recycleview layout
        MyViewHolder searchholder =  new MyViewHolder(view);
        return searchholder;
    }
    @Override
    public void onBindViewHolder(@NonNull SearchRecycleView.MyViewHolder searchholder, int position) {
        String id = songList.get(position).getId();
        searchholder.searchArtistimage.setImageResource(songList.get(position).getDrawable());
        searchholder.searchSongtitle.setText(String.valueOf(songList.get(position).getTitle()));
        searchholder.searchArtistname.setText(String.valueOf(songList.get(position).getArtiste()));
        searchholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = songCollection.searchSongById(id); //search song based on ID
                Intent aftersearchsongpage = new Intent(context, PlaySongActivity.class); //Go to PlaySong Page
                aftersearchsongpage.putExtra("index", index); //Play Song according to the ID
                context.startActivity(aftersearchsongpage);

            }
        });
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public void searchedList(ArrayList<Song> searchedList)
    {
        songList = searchedList;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView searchArtistimage;
        TextView searchArtistname;
        TextView  searchSongtitle;
        ConstraintLayout parentLayout;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            searchArtistimage = itemView.findViewById(R.id.searchrvartistcover);
            searchArtistname = itemView.findViewById(R.id.searchrvartistname);
            searchSongtitle = itemView.findViewById(R.id.searchrvsongname);
            parentLayout = itemView.findViewById(R.id.searchrvconstraintlayout);
        }
    }
}
