package com.example.musicstream;

public class GenreSong {
    private Song song;


    public GenreSong(Song song)
    {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
