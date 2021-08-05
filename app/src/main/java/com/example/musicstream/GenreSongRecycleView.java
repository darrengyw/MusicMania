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

    SongCollection songCollection = new SongCollection();
    List<GenreSong> genreSongList;
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
                int index = songCollection.searchSongById(id);
                Intent genresongpage = new Intent(context, PlaySongActivity.class);
                genresongpage.putExtra("index", index);
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
