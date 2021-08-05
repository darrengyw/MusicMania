package com.example.musicstream;

import java.util.ArrayList;
import java.util.List;

public class GenreSongCollection {
    SongCollection songCollection = new SongCollection();
    List<List> genresong = new ArrayList<>();
    List<GenreSong> japanesesongs = new ArrayList<>();          //Japanese Song
    List<GenreSong> englishsongs = new ArrayList<>();          //English Song
    List<GenreSong> chinesesongs = new ArrayList<>();           //Chinese Song
    List<GenreSong> koreansongs = new ArrayList<>();           //Korean Song

    public GenreSongCollection() {
        GenreSong japanesesong1 = new GenreSong(songCollection.songs[36]);
        GenreSong japanesesong2 = new GenreSong(songCollection.songs[37]);
        GenreSong japanesesong3 = new GenreSong(songCollection.songs[38]);
        GenreSong japanesesong4 = new GenreSong(songCollection.songs[39]);
        GenreSong japanesesong5 = new GenreSong(songCollection.songs[40]);
        japanesesongs.add(japanesesong1);
        japanesesongs.add(japanesesong2);
        japanesesongs.add(japanesesong3);
        japanesesongs.add(japanesesong4);
        japanesesongs.add(japanesesong5);
        genresong.add(japanesesongs);
        //Japanese Songs
        GenreSong englishsong1 = new GenreSong(songCollection.songs[41]);
        GenreSong englishsong2 = new GenreSong(songCollection.songs[42]);
        GenreSong englishsong3 = new GenreSong(songCollection.songs[43]);
        GenreSong englishsong4 = new GenreSong(songCollection.songs[44]);
        GenreSong englishsong5 = new GenreSong(songCollection.songs[45]);
        englishsongs.add(englishsong1);
        englishsongs.add(englishsong2);
        englishsongs.add(englishsong3);
        englishsongs.add(englishsong4);
        englishsongs.add(englishsong5);
        genresong.add(englishsongs);
        //English Songs
        GenreSong chinesesong1 = new GenreSong(songCollection.songs[46]);
        GenreSong chinesesong2 = new GenreSong(songCollection.songs[47]);
        GenreSong chinesesong3 = new GenreSong(songCollection.songs[48]);
        GenreSong chinesesong4 = new GenreSong(songCollection.songs[49]);
        GenreSong chinesesong5 = new GenreSong(songCollection.songs[50]);
        chinesesongs.add(chinesesong1);
        chinesesongs.add(chinesesong2);
        chinesesongs.add(chinesesong3);
        chinesesongs.add(chinesesong4);
        chinesesongs.add(chinesesong5);
        genresong.add((chinesesongs));
        //Chinese Songs
        GenreSong koreansong1 = new GenreSong(songCollection.songs[51]);
        GenreSong koreansong2 = new GenreSong(songCollection.songs[52]);
        GenreSong koreansong3 = new GenreSong(songCollection.songs[53]);
        GenreSong koreansong4 = new GenreSong(songCollection.songs[54]);
        GenreSong koreansong5 = new GenreSong(songCollection.songs[55]);
        koreansongs.add(koreansong1);
        koreansongs.add(koreansong2);
        koreansongs.add(koreansong3);
        koreansongs.add(koreansong4);
        koreansongs.add(koreansong5);
        genresong.add(koreansongs);
        //Korean Songs

    }
}

