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

public class ArtistSongRecycleView extends RecyclerView.Adapter<ArtistSongRecycleView.MyViewHolder>{
    List<ArtistSong> artistSongList;
    Context context;

    public ArtistSongRecycleView(List<ArtistSong> artistSongList, Context context)
    {
        this.artistSongList= artistSongList;
        this.context = context;
    }
    @NonNull
    @Override
    public ArtistSongRecycleView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_songlayout,parent,false);
        MyViewHolder artistsongholder =  new MyViewHolder(view);
        return artistsongholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistSongRecycleView.MyViewHolder artistsongholder, int position) {
        artistsongholder.artistimage.setImageResource((artistSongList.get(position).getDrawable()));
        artistsongholder.songtitle.setText(String.valueOf(artistSongList.get(position).getArtistsongtitle()));
        artistsongholder.artisttitle.setText(String.valueOf(artistSongList.get(position).getArtistname()));

    }

    @Override
    public int getItemCount() {
        return artistSongList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView artistimage;
        TextView songtitle;
        TextView artisttitle;
        ConstraintLayout parentLayout;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            artistimage = itemView.findViewById(R.id.artistimage);
            songtitle = itemView.findViewById(R.id.songtitle);
            artisttitle = itemView.findViewById(R.id.artisttitle);
            parentLayout = itemView.findViewById(R.id.constraintsonglayout);
        }
    }
}
