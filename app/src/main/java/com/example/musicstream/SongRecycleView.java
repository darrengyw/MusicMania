package com.example.musicstream;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongRecycleView extends RecyclerView.Adapter<SongRecycleView.MyViewHolder> {
    List<Song> songList;
    Context context;

    public SongRecycleView(List<Song> songList, Context context) {
        this.songList = songList;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_layout,parent, false);
        MyViewHolder songholder = new MyViewHolder((view));
        return songholder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder songholder, int position) {
        songholder.songname.setText(songList.get(position).getTitle());
        songholder.songcover.setImageResource(songList.get(position).getDrawable());
        songholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, songList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                Intent songpage = new Intent(context, PlaySongActivity.class);
                songpage.putExtra("index", position);
                context.startActivity(songpage);
            }
        });
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView songcover;
        TextView songname;
        RelativeLayout parentLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            songcover = itemView.findViewById(R.id.songcover);
            songname = itemView.findViewById((R.id.texttitle));
            parentLayout = itemView.findViewById(R.id.constraintsonglayout);
        }
    }
}
