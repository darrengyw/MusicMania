package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongCollection {

    List<Song> songtrack = new ArrayList<Song>();
    Song songs[] = new Song[6];
    public SongCollection(){

        Song NoTearsLeftToCry = new Song("image1",
                "No Tears Left To Cry",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/867381181825417216/Ariana_Grande_-_No_Tears_Left_To_Cry.mp3",
                3.26,
                R.drawable.arianagrande_songcover_);

        Song CallCasting = new Song("image2",
                "Call Casting",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/867376643751936021/Migos_-_Call_Casting.mp3",
                3.56,
                R.drawable.migos_songcover_);

        Song BankAccount = new Song("image3",
                "Bank Account",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/867376427190714398/21_Savage_-_Bank_Account.mp3",
                3.40,
                R.drawable.twentyone_savage_songcover_);
        Song BackOn = new Song("image4",
                "Back On",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/867376567645896724/Gucci_Mane_-_Back_On.mp3",
                3.02,
                R.drawable.guccimane_songcover_);

        Song ForeverYoung = new Song("image5",
                "Forever Young",
                "Black Pink","https://cdn.discordapp.com/attachments/865599440189653062/867382444117065728/BLACKPINK_-_FOREVER_YOUNG.mp3",
                3.54,
                R.drawable.blackpink_songcover_);

        Song AfterMoon  = new Song("image5",
                "After Moon",
                "Twice","https://cdn.discordapp.com/attachments/865599440189653062/867376683706351626/TWICE_-_AFTER_MOON.mp3",
                3.24,
                R.drawable.twice_songcover_);

        songs[0] = NoTearsLeftToCry;
        songs[1] = CallCasting;
        songs[2] = BankAccount;
        songs[3] = BackOn;
        songs[4] = ForeverYoung;
        songs[5] = AfterMoon;

        songtrack.addAll(Arrays.asList(songs));


    }

    public List<Song> getSongtrack()
    {
        return songtrack;
    }

    public Song getCurrentSong(int currentSongId){

        return songs[currentSongId];
    }

    public int getNextSong(int currentSongIndex){
        if (currentSongIndex >= songs.length-1){
            return currentSongIndex;
        }
        else{
         return currentSongIndex +1;
        }
    }
    public int getPrevSong (int currentSongIndex){
        if (currentSongIndex <= 0){
            return currentSongIndex;
        }
        else {
            return currentSongIndex -1;
        }
    }
}
