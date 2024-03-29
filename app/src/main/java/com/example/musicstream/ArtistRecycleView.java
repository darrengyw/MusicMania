package com.example.musicstream;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class ArtistRecycleView extends RecyclerView.Adapter<ArtistRecycleView.MyViewHolder>
{
    //RecycleView for Artist
    List<Artist> artistList; //Using the artist array to assign in RecycleView
    Context context; //Assigning the artist array to display on ArtistSongActivity class page

    public ArtistRecycleView(List<Artist> artistList, Context context) {
        this.artistList = artistList;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_layout,parent, false);
        //Displaying the artist array in the recycleview layout
        MyViewHolder artistholder = new MyViewHolder(view);
        return artistholder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder artistholder, int position) {
        artistholder.artistname.setText(String.valueOf(artistList.get(position).getTitle())); //textview for artistname
        artistholder.artistcover.setImageResource(artistList.get(position).getDrawable());    //imageview for artist image
        artistholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Artist: " + artistList.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                Intent artistsongpage = new Intent(context, ArtistSongActivity.class); //Go to Artist Info Page
                artistsongpage.putExtra("index", position);
                context.startActivity(artistsongpage);
            }
        });
        }

    @Override
    public int getItemCount() {
        return artistList.size(); //List the array in the recycleview according to the size
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView artistcover;
        TextView artistname;
        ConstraintLayout parentLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            artistcover = itemView.findViewById(R.id.artistcover);
            artistname = itemView.findViewById(R.id.txtartistname);
            parentLayout = itemView.findViewById(R.id.constraintartistlayout);
        }
    }
}
