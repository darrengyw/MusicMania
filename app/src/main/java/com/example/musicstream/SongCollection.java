package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongCollection {
    List<Song> songtrack = new ArrayList<Song>();
    Song songs[] = new Song[56];
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
        Song AfterMoon  = new Song("image6",
                "After Moon",
                "Twice","https://cdn.discordapp.com/attachments/865599440189653062/867376683706351626/TWICE_-_AFTER_MOON.mp3",
                3.24,
                R.drawable.twice_songcover_);
        //SongForYou
        Song ThirtyFourThirtyFive = new Song("image7",
                "34 35",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870644995445645362/Ariana_Grande_-_3435.mp3",
                2.54,
                R.drawable.arianagrande34_35);
        Song Bloodline = new Song("image8",
                "Bloodline",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870645024805777449/Ariana_Grande_-_Bloodline.mp3",
                3.37,
                R.drawable.arianagrandebloodline);
        Song GodIsAWoman = new Song("image9",
                "God is a woman",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870645075695243284/Ariana_Grande_-_God_is_a_woman.mp3",
                3.25,
                R.drawable.arianagrande_giaw);
        Song Position = new Song("image10",
                "Position",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870646498797436988/Ariana_Grande_-_positions.mp3",
                2.53,
                R.drawable.arianagrande_position);
        Song Sometimes = new Song("image11",
                "Sometimes",
                "Ariana Grande","https://cdn.discordapp.com/attachments/865599440189653062/870646628250447922/Ariana_Grande_-_Sometimes.mp3",
                3.54,
                R.drawable.arianagrande_sometimes);
        //ArianaGrande Songs
        Song Intro = new Song("image12",
                "Intro",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871239955995852821/MigosQuality_Control_Lil_Yachty_-_Intro_feat._Gucci_Mane.mp3",
                3.36,R.drawable.migos_intro);
        Song TooBlessed = new Song("image13",
                "Too Blessed",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240009372561480/Migos_Quavo__Take_Off_Rich_The_Kid_-_Too_Blessed.mp3",
                3.21,R.drawable.migos_too_blessed);
        Song WorkHard = new Song("image14",
                "Work Hard",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240056592039946/Migos_-_Work_Hard.mp3",
                5.19,R.drawable.migos_work_hard);
        Song Vaccine = new Song("image15",
                "Vaccine",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240073830629376/Migos_-_Vaccine.mp3",
                3.42,R.drawable.migos_vaccine);
        Song Supastars = new Song("image16",
                " Supastars",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240108811092018/Migos_-_Supastars.mp3",
                4.55,R.drawable.migos_superstars);
        //Migos Songs
        Song x = new Song("Image17",
                "X",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249412855308308/21_Savage__Metro_Boomin_ft._Future_-_X_.mp3",
                4.18,R.drawable.twentyonesavage_x);
        Song GhostFaceKillers = new Song("Image18",
                "GhostFace Killers",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249449287032842/21_Savage_ft._Travis_Scott_Offset__Metro_Boomin_-_Ghostface_Killers.mp3",
                4.29,R.drawable.twentyonesavage_ghostface_killers);
        Song GucciOnMy = new Song("Image19",
                "Gucci On My",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249479414730772/Migos_ft._21_Savage_YGMike_WiLL_Made-It_-_Gucci_On_My_.mp3",
                4.35,R.drawable.twentyonesavage_gucci_on_my);
        Song SavageMode = new Song("Image20",
                "Savage Mode",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249527758282782/21_Savage__Metro_Boomin_-_Savage_Mode.mp3",
                4.09,R.drawable.twentyonesavage_savage_mode);
        Song Tiffany = new Song("Image21",
                "Tiffany",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249541733683210/21_Savage_ft._Offset__Tyga_-_Tiffany.mp3",
                4.09,R.drawable.twentyonesavage_tiffany);
        //21Savage Songs
        Song Life = new Song("image22",
                "Life",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258137297059901/Desiigner_-_Liife_ft._Gucci_Mane.mp3",
                3.17, R.drawable.gucci_mane_life);
        Song SolcyBoyz3 = new Song("image23",
                "SolcyBoyz",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258153843560468/Gucci_Mane_ft._Big_ScarrPooh_Shiesty__Foogiano_-_SoIcyBoyz_3.mp3",
                3.33, R.drawable.gucci_mane_solcyboyz3);
        Song MetGala = new Song("image24",
                "Met Gala",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258161246507009/Gucci_Mane_ft._Offset_-_Met_Gala.mp3",
                3.33, R.drawable.gucci_mane_met_gala);
        Song SemiOnEm = new Song("image25",
                "Semi On 'Em",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258174278230057/Gucci_Mane_ft.Chief_Keef_-_Semi_On_Em.mp3",
                2.51, R.drawable.gucci_mane_semi_on__em);
        Song DifferentGame = new Song("image26",
                "Different Game",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258191097368626/Jackson_Wang_-_Different_Game_ft._Gucci_Mane.mp3",
                3.08, R.drawable.gucci_mane_different_game);
        //GucciMane Songs
        Song Boombayah = new Song("image27",
                "Boombayah",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263077142790184/BLACKPINK_-_BOOMBAYAH.mp3",
                3.08, R.drawable.blackpink_boombayah);
        Song Dududu = new Song("image28",
                "Dududu",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263089310437416/BLACKPINK_-_DDU-DU_DDU-DU.mp3",
                3.08, R.drawable.blackpink_dududu);
        Song KillThisLove = new Song("image29",
                "Kill This Love",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263115394842624/BLACKPINK_-_Kill_This_Love.mp3",
                3.08, R.drawable.blackpink_kill_this_love);
        Song PlayingWithFire = new Song("image30",
                "Playing With Fire",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263143840583730/BLACKPINK_-_PLAYING_WITH_FIRE.mp3",
                3.08, R.drawable.blackpink_playing_with_fire);
        Song KissAndMakeup = new Song("image31",
                "Kiss and Makeup",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263208621613106/BLACKPINK__Dua_Lipa_-_Kiss_and_Make_Up.mp3",
                3.08, R.drawable.blackpink_kiss_and_makeup);
        //Blackpink Songs
        Song TT = new Song("image32",
                "TT",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266567420268544/Twice-_TT.mp3",
                3.34, R.drawable.twice_tt);
        Song GoodPerson = new Song("image33",
                "GoodPerson",
                "Mina(Twice)",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266636680810517/Twice_Mina_-_Good_Person.mp3",
                4.29, R.drawable.twice_mina_good_person);
        Song Fancy = new Song("34",
                "Fancy",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266696181219338/TWICE_-_FANCY.mp3",
                3.27, R.drawable.twice_fancy);
        Song FeelSpecial= new Song("image35",
                "Feel Special",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266715445624862/TWICE_-_Feel_Special.mp3",
                3.36, R.drawable.twice_feel_special);
        Song YouInMyHeart= new Song("image36",
                "You In My Heart",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266836681981972/TwiceTwicetagram_-_YOU_IN_MY_HEART.mp3",
                3.29, R.drawable.twice_you_in_my_heart);
        //Twice
        Song japanesesong1 =  new Song("Image37",
                "Hikari to Kage no Hibi",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596546574155826/AKB48_-_Hikari_to_Kage_no_Hibi.mp3",
                4.27, R.drawable.japanesesong
        );
        Song japanesesong2 =  new Song("Image38",
                "No Way Man",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596596352127067/AKB48_-_NO_WAY_MAN.mp3",
                5.18, R.drawable.japanesesong
        );
        Song japanesesong3 =  new Song("Image39",
                "Inochi Wa Utsukushii",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596672151613510/Nogizaka46_-_Inochi_Wa_Utsukushii.mp3",
                5.11, R.drawable.japanesesong
        );
        Song japanesesong4 =  new Song("Image40",
                "Seifuku_no_Mannequin",
                "AKB48",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596715424239676/Nogizaka46_-_Seifuku_no_Mannequin.mp3",
                4.16, R.drawable.japanesesong
        );
        Song japanesesong5 =  new Song("Image41",
                "卒業",
                "Twice (Sana)",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596759397314590/Twice_SANA_-_.mp3",
                2.25, R.drawable.japanesesong
        );
        //Japanese Songs
        Song englishsong1 =  new Song("Image42",
                "Cheap Thrills",
                "Sia",
                "https://cdn.discordapp.com/attachments/865599440189653062/871594268089806869/Sia_-_Cheap_Thrills.mp3",
                3.33, R.drawable.english_song
        );
        Song englishsong2 =  new Song("Image43",
                "Labrinth",
                "Sia",
                "https://cdn.discordapp.com/attachments/865599440189653062/871594304756404304/Sia_-_Genius_ft._LSD_Diplo_Labrinth.mp3",
                3.38, R.drawable.english_song
        );
        Song englishsong3 =  new Song("Image44",
                "4 Days",
                "Belly",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595368813592606/Belly_ft._YG_-_4_Days.mp3",
                3.10, R.drawable.english_song
        );
        Song englishsong4 =  new Song("Image45",
                "Wake Up In The Sky",
                "Bruno Mars",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595379232235571/Bruno_Mars_-_Wake_Up_in_The_Sky.mp3",
                3.26, R.drawable.english_song
        );
        Song englishsong5 =  new Song("Image46",
                "End Of Time",
                "Beyonce",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595380083671040/Beyonce_-_End_of_Time.mp3",
                3.43, R.drawable.english_song
        );
        //English Songs
        Song chinesesong1=  new Song("Image47",
                "說散就散",
                "JC",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595763518562384/JC_-_.mp3",
                4.02, R.drawable.chinese_song
        );
        Song chinesesong2=  new Song("Image48",
                "空心",
                "光澤",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595785719005244/-_.mp3",
                4.39, R.drawable.chinese_song
        );
        Song chinesesong3 =  new Song("Image49",
                "那女孩对我说",
                "戴羽彤",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595786125852682/-_.mp3",
                5.03, R.drawable.chinese_song
        );
        Song chinesesong4=  new Song("Image50",
                "艾辰 「往後餘生 風雪是你 平淡是你 清貧也是你」",
                "艾辰",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595796468998144/-_MEIYOU_.mp3",
                6.07, R.drawable.chinese_song
        );
        Song chinesesong5=  new Song("Image51",
                "綠色",
                "陳雪凝",
                "https://cdn.discordapp.com/attachments/865599440189653062/871595813107793940/-_.mp3",
                4.30, R.drawable.chinese_song
        );
        //Chinese Songs
        Song koreansong1 =  new Song("Image52",
                "FAKE LOVE",
                "BTS",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596102539960370/BTS_-_FAKE_LOVE.mp3",
                4.02, R.drawable.korean_song
        );
        Song koreansong2 =  new Song("Image53",
                "Given-Taken",
                "ENHYPEN",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596116192415754/ENHYPEN_-_Given-Taken.mp3",
                3.03, R.drawable.korean_song
        );
        Song koreansong3 =  new Song("Image54",
                "Overdose",
                "EXO",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596130968948776/EXO_-_Overdose.mp3",
                3.25, R.drawable.korean_song
        );
        Song koreansong4 =  new Song("Image55",
                "NAVILLERA",
                "GFRIEND",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596149776187452/GFRIEND_NAVILLERA.mp3",
                3.13, R.drawable.korean_song
        );
        Song koreansong5 =  new Song("Image56",
                "Only One",
                "BoA",
                "https://cdn.discordapp.com/attachments/865599440189653062/871596362968494100/BoA_-_Only_One.mp3",
                3.38, R.drawable.korean_song
        );
        //KoreanSongs
        songs[0] = NoTearsLeftToCry;
        songs[1] = CallCasting;
        songs[2] = BankAccount;
        songs[3] = BackOn;
        songs[4] = ForeverYoung;
        songs[5] = AfterMoon;
        //SongForYou
        songs[6] = ThirtyFourThirtyFive;
        songs[7] = Bloodline;
        songs[8] = GodIsAWoman;
        songs[9] = Position;
        songs[10] = Sometimes;
        //ArianaGrande
        songs[11] = Intro;
        songs[12] = TooBlessed;
        songs[13] = WorkHard;
        songs[14] = Vaccine;
        songs[15] = Supastars;
        //Migos
        songs[16] = x;
        songs[17] = GhostFaceKillers;
        songs[18] = GucciOnMy;
        songs[19] = SavageMode;
        songs[20] = Tiffany;
        //21Savage
        songs[21] = Life;
        songs[22] = SolcyBoyz3;
        songs[23] = MetGala;
        songs[24] = SemiOnEm;
        songs[25] = DifferentGame;
        //GucciMane
        songs[26] = Boombayah;
        songs[27] = Dududu;
        songs[28] = KillThisLove;
        songs[29] = PlayingWithFire;
        songs[30] = KissAndMakeup;
        //Blackpink
        songs[31] = TT;
        songs[32] = GoodPerson;
        songs[33] = Fancy;
        songs[34] = FeelSpecial;
        songs[35] = YouInMyHeart;
        //Twice
        songs[36] = japanesesong1;
        songs[37] = japanesesong2;
        songs[38] = japanesesong3;
        songs[39] = japanesesong4;
        songs[40] = japanesesong5;
        //Genre-JapaneseSong
        songs[41] = englishsong1;
        songs[42] = englishsong2;
        songs[43] = englishsong3;
        songs[44] = englishsong4;
        songs[45] = englishsong5;
        //Genre-EnglishSong
        songs[46] = chinesesong1;
        songs[47] = chinesesong2;
        songs[48] = chinesesong3;
        songs[49] = chinesesong4;
        songs[50] = chinesesong5;
        //Genre-ChineseSong
        songs[51] = koreansong1;
        songs[52] = koreansong2;
        songs[53] = koreansong3;
        songs[54] = koreansong4;
        songs[55] = koreansong5;
        //Genre-KoreanSong
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
    public int searchSongById(String id) {
        for (int index = 0; index < songs.length; index++) {
            Song tempSong = songs[index];
            if (tempSong.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public Song[] getSongs() {
        return songs;
    }
}
