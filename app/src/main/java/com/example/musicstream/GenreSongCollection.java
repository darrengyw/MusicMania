package com.example.musicstream;

import java.util.ArrayList;
import java.util.List;

public class GenreSongCollection {
    List<List> genresong = new ArrayList<>();
    List<GenreSong> japanesesongs = new ArrayList<>();          //Japanese Song
    List<GenreSong> englishsongs = new ArrayList<>();          //English Song
    List<GenreSong> chinesesongs= new ArrayList<>();           //Chinese Song
    List<GenreSong> koreansongs = new ArrayList<>();           //Korean Song

    public GenreSongCollection()
    {
        GenreSong japanesesong1 =  new GenreSong("Image1",
                "Hikari to Kage no Hibi",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596546574155826/AKB48_-_Hikari_to_Kage_no_Hibi.mp3",
                4.27, R.drawable.japanesesong
        );
        GenreSong japanesesong2 =  new GenreSong("Image2",
                "No Way Man",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596596352127067/AKB48_-_NO_WAY_MAN.mp3",
                5.18, R.drawable.japanesesong
        );
        GenreSong japanesesong3 =  new GenreSong("Image3",
                "Inochi Wa Utsukushii",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596672151613510/Nogizaka46_-_Inochi_Wa_Utsukushii.mp3",
                5.11, R.drawable.japanesesong
        );
        GenreSong japanesesong4 =  new GenreSong("Image4",
                "Seifuku no Mannequin",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596715424239676/Nogizaka46_-_Seifuku_no_Mannequin.mp3",
                4.16, R.drawable.japanesesong
        );
        GenreSong japanesesong5 =  new GenreSong("Image5",
                "卒業",
                "Twice (Sana)",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596759397314590/Twice_SANA_-_.mp3",
                2.25, R.drawable.japanesesong
        );
        japanesesongs.add(japanesesong1);
        japanesesongs.add(japanesesong2);
        japanesesongs.add(japanesesong3);
        japanesesongs.add(japanesesong4);
        japanesesongs.add(japanesesong5);
        genresong.add(japanesesongs);
        //Japanese Songs

        GenreSong englishsong1 =  new GenreSong("Image1",
                "Cheap Thrills",
                "Sia",
                "https://cdn.discordapp.com/attachments/865599440189653062/871594268089806869/Sia_-_Cheap_Thrills.mp3",
                3.33, R.drawable.english_song
        );
        GenreSong englishsong2 =  new GenreSong("Image2",
                "Labrinth",
                "Sia",
                "https://cdn.discordapp.com/attachments/865599440189653062/871594304756404304/Sia_-_Genius_ft._LSD_Diplo_Labrinth.mp3",
                3.38, R.drawable.english_song
        );
        GenreSong englishsong3 =  new GenreSong("Image3",
                "4 Days",
                "Belly",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595368813592606/Belly_ft._YG_-_4_Days.mp3",
                3.10, R.drawable.english_song
        );
        GenreSong englishsong4 =  new GenreSong("Image4",
                "Wake Up In The Sky",
                "Bruno Mars",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595379232235571/Bruno_Mars_-_Wake_Up_in_The_Sky.mp3",
                3.26, R.drawable.english_song
        );
        GenreSong englishsong5 =  new GenreSong("Image5",
                "End Of Time",
                "Beyonce",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595380083671040/Beyonce_-_End_of_Time.mp3",
                3.43, R.drawable.english_song
        );
        englishsongs.add(englishsong1);
        englishsongs.add(englishsong2);
        englishsongs.add(englishsong3);
        englishsongs.add(englishsong4);
        englishsongs.add(englishsong5);
        genresong.add(englishsongs);
        //English Songs

        GenreSong chinesesong1=  new GenreSong("Image1",
                "說散就散",
                "JC",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595763518562384/JC_-_.mp3",
                4.02, R.drawable.chinese_song
        );
        GenreSong chinesesong2=  new GenreSong("Image2",
                "空心",
                "光澤",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595785719005244/-_.mp3",
                4.39, R.drawable.chinese_song
        );
        GenreSong chinesesong3 =  new GenreSong("Image3",
                "那女孩对我说",
                "戴羽彤",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595786125852682/-_.mp3",
                5.03, R.drawable.chinese_song
        );
        GenreSong chinesesong4=  new GenreSong("Image4",
                "MEIYOU 「往後餘生 風雪是你 平淡是你 清貧也是你」",
                "艾辰",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595796468998144/-_MEIYOU_.mp3",
                6.07, R.drawable.chinese_song
        );
        GenreSong chinesesong5=  new GenreSong("Image5",
                "綠色",
                "陳雪凝",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595813107793940/-_.mp3",
                4.30, R.drawable.chinese_song
        );
        chinesesongs.add(chinesesong1);
        chinesesongs.add(chinesesong2);
        chinesesongs.add(chinesesong3);
        chinesesongs.add(chinesesong4);
        chinesesongs.add(chinesesong5);
        genresong.add((chinesesongs));
        //Chinese Songs

        GenreSong koreansong1 =  new GenreSong("Image1",
                "FAKE LOVE",
                "BTS",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596102539960370/BTS_-_FAKE_LOVE.mp3",
                4.02, R.drawable.korean_song
        );
        GenreSong koreansong2 =  new GenreSong("Image2",
                "Given-Taken",
                "ENHYPEN",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596116192415754/ENHYPEN_-_Given-Taken.mp3",
                3.03, R.drawable.korean_song
        );
        GenreSong koreansong3 =  new GenreSong("Image3",
                "Overdose",
                "EXO",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596130968948776/EXO_-_Overdose.mp3",
                3.25, R.drawable.korean_song
        );
        GenreSong koreansong4 =  new GenreSong("Image4",
                "NAVILLERA",
                "GFRIEND",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596149776187452/GFRIEND_NAVILLERA.mp3",
                3.13, R.drawable.korean_song
        );
        GenreSong koreansong5 =  new GenreSong("Image5",
                "Only One",
                "BoA",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596362968494100/BoA_-_Only_One.mp3",
                3.38, R.drawable.korean_song
        );
        koreansongs.add(koreansong1);
        koreansongs.add(koreansong2);
        koreansongs.add(koreansong3);
        koreansongs.add(koreansong4);
        koreansongs.add(koreansong5);
        genresong.add(koreansongs);
        //Korean Songs
    }
}

