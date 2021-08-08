package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistCollection {
    List<Artist> artisttrack = new ArrayList<Artist>(); //ArrayList for Artist
    private Artist artists[] = new Artist[6];      //Artist Array Index Size: 6

    public ArtistCollection()
    {
        Artist arianagrande = new Artist("artist1",
                "Ariana Grande",
                R.drawable.arianagrande);
        Artist migos = new Artist ("artist2",
                "Migos",
                R.drawable.migos);
        Artist twentyonesavage =  new Artist("artist3",
                "21 Savage",
                R.drawable.twentyonesavage);
        Artist guccimane = new Artist("artist4",
                "Gucci Mane",
                R.drawable.guccimane);
        Artist blackpink = new Artist("artist4",
                "BlackPink",
                R.drawable.blackpink);
        Artist twice = new Artist("artist5",
                "Twice",
                R.drawable.twice);

        artists[0] = arianagrande;
        artists[1] = migos;
        artists[2] = twentyonesavage;
        artists[3] = guccimane;
        artists[4] = blackpink;
        artists[5] = twice;

        artisttrack.addAll(Arrays.asList(artists)); //add artist array into list
    }
    public List<Artist> getArtist() {
        return artisttrack; //return all the artist's index

    }

}
