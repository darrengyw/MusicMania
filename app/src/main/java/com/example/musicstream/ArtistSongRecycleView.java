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
    //Reycleview for ArtistSong
    SongCollection songCollection = new SongCollection(); //Getting the SongArray from SongCollection
    List<ArtistSong> artistSongList; //Getting artistsong from SongCollection
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
        //Displaying the artist song array in the recycleview layout
        MyViewHolder artistsongholder =  new MyViewHolder(view);
        return artistsongholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistSongRecycleView.MyViewHolder artistsongholder, int position) {
        String id = artistSongList.get(position).getSong().getId();
        artistsongholder.artistimage.setImageResource((artistSongList.get(position).getSong().getDrawable()));
        artistsongholder.songtitle.setText(String.valueOf(artistSongList.get(position).getSong().getTitle()));
        artistsongholder.artisttitle.setText(String.valueOf(artistSongList.get(position).getSong().getArtiste()));
        artistsongholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, artistSongList.get(position).getSong().getTitle(), Toast.LENGTH_SHORT).show();
                int index = songCollection.searchSongById(id); //search song based on ID
                Intent artistsongpage = new Intent(context, PlaySongActivity.class); //Go to PlaySong Page
                artistsongpage.putExtra("index", index); //Play Song according to the ID
                context.startActivity(artistsongpage);
            }
        });

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
            songtitle = itemView.findViewById(R.id.artistsongtitle);
            artisttitle = itemView.findViewById(R.id.artisttitle);
            parentLayout = itemView.findViewById(R.id.artistsongconstraint);
        }
    }
}
