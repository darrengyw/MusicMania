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

public class GenreRecycleView extends RecyclerView.Adapter<GenreRecycleView.MyViewHolder>
{
    List<Genre> genreList;
    Context context;
    public GenreRecycleView(List<Genre> genreList, Context context)
    {
        this.genreList = genreList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.genre_layout,parent,false);
        MyViewHolder genreholder = new MyViewHolder(view);
        return genreholder;
    }

    @Override
    public void onBindViewHolder(@NonNull GenreRecycleView.MyViewHolder genreholder, int position) {
        genreholder.genretitle.setText(String.valueOf(genreList.get(position).getGenretitle()));
        genreholder.genreimage.setImageResource(genreList.get(position).getDrawable());
        genreholder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Genre: " + genreList.get(position).getGenretitle(),Toast.LENGTH_SHORT).show();
                Intent genresongpage = new Intent(context, GenreSongActivity.class);
                genresongpage.putExtra("index", position);
                context.startActivity(genresongpage);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return genreList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView genreimage;
        TextView genretitle;
        ConstraintLayout parentLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            genreimage = itemView.findViewById(R.id.genreimage);
            genretitle = itemView.findViewById(R.id.genretitle);
            parentLayout = itemView.findViewById(R.id.genreconstraintlayout);
        }
    }
}
