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

import java.util.List;

public class GenreSongRecycleView extends RecyclerView.Adapter<GenreSongRecycleView.MyViewHolder>{

    //Reycleview for GenreSong
    SongCollection songCollection = new SongCollection(); //Getting the SongArray from SongCollection
    List<GenreSong> genreSongList; //Getting artistsong from SongCollection
    Context context;

    public GenreSongRecycleView(List<GenreSong> genreSongList, Context context)
    {
        this.genreSongList= genreSongList;
        this.context = context;
    }
    @NonNull
    @Override
    public GenreSongRecycleView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.genre_songlayout,parent,false);
        //Displaying the genre song array in the recycleview layout
        MyViewHolder genresongholder =  new MyViewHolder(view);
        return genresongholder;
    }

    @Override
    public void onBindViewHolder(@NonNull GenreSongRecycleView.MyViewHolder genresongholder, int position) {
        String id = genreSongList.get(position).getSong().getId();
        genresongholder.genreimage.setImageResource(genreSongList.get(position).getSong().getDrawable());
        genresongholder.genresongtitle.setText(String.valueOf(genreSongList.get(position).getSong().getTitle()));
        genresongholder.genretitle.setText(String.valueOf(genreSongList.get(position).getSong().getArtiste()));
        genresongholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, genreSongList.get(position).getSong().getTitle(), Toast.LENGTH_SHORT).show();
                int index = songCollection.searchSongById(id); //search song based on ID
                Intent genresongpage = new Intent(context, PlaySongActivity.class); //Go to PlaySong Page
                genresongpage.putExtra("index", index); //Play Song according to the ID
                context.startActivity(genresongpage);
            }
        });
    }

    @Override
    public int getItemCount() {
        return genreSongList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView genreimage;
        TextView genretitle;
        TextView genresongtitle;
        ConstraintLayout parentLayout;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            genreimage = itemView.findViewById(R.id.genreimage);
            genresongtitle = itemView.findViewById(R.id.genresongtitle);
            genretitle = itemView.findViewById(R.id.genretitle);
            parentLayout = itemView.findViewById(R.id.genresongconstraint);
        }
    }
}
