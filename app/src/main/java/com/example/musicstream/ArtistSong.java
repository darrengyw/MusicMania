package com.example.musicstream;

public class ArtistSong {
    private Song song;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public ArtistSong(Song song) {
        this.song = song;
    }

}
