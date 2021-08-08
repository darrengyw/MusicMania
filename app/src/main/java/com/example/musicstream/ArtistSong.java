package com.example.musicstream;

public class ArtistSong {
    private Song song;

    public ArtistSong(Song song) {
        this.song = song;
    }
    //Assign the variable into getter and setter
    public Song getSong() {
        return song;
    }
    //This method sets the Song Context
    public void setSong(Song song) {
        this.song = song;
    }
    //This method gets the Song Context



}
