package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistSongCollection {
    List<List> artistsong = new ArrayList<>();
    List<ArtistSong> arianagrandesongs = new ArrayList<>();        //Ariana Grande Song
    List<ArtistSong> migossongs = new ArrayList<>();              //Migos Song
    List<ArtistSong> twentyonesavagesongs = new ArrayList<>();   //21 Savage Song
    List<ArtistSong> guccimanesongs = new ArrayList<>();        //Gucci Mane Song
    List<ArtistSong> blackpinksongs = new ArrayList<>();        //Blackpink Song
    List<ArtistSong> twicesongs = new ArrayList<>();           //Twice Song

    public ArtistSongCollection(){
        ArtistSong ThirtyFourThirtyFive = new ArtistSong("image1",
                "34 35",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870644995445645362/Ariana_Grande_-_3435.mp3",
                2.54,
                R.drawable.arianagrande34_35);
        ArtistSong Bloodline = new ArtistSong("image2",
                "Bloodline",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870645024805777449/Ariana_Grande_-_Bloodline.mp3",
                3.37,
                R.drawable.arianagrandebloodline);
        ArtistSong GodIsAWoman = new ArtistSong("image3",
                "God is a woman",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870645075695243284/Ariana_Grande_-_God_is_a_woman.mp3",
                3.25,
                R.drawable.arianagrande_giaw);
        ArtistSong Position = new ArtistSong("image4",
                "Position",
                "Ariana Grande",
                "https://cdn.discordapp.com/attachments/865599440189653062/870646498797436988/Ariana_Grande_-_positions.mp3",
                2.53,
                R.drawable.arianagrande_position);

        ArtistSong Sometimes = new ArtistSong("image5",
                "Sometimes",
                "Ariana Grande","https://cdn.discordapp.com/attachments/865599440189653062/870646628250447922/Ariana_Grande_-_Sometimes.mp3",
                3.54,
                R.drawable.arianagrande_sometimes);
        arianagrandesongs.add(ThirtyFourThirtyFive);
        arianagrandesongs.add(Bloodline);
        arianagrandesongs.add(GodIsAWoman);
        arianagrandesongs.add(Position);
        arianagrandesongs.add(Sometimes);
        artistsong.add(arianagrandesongs);
        //ArianaGrande Songs

        ArtistSong Intro = new ArtistSong("image1",
                "Intro",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871239955995852821/MigosQuality_Control_Lil_Yachty_-_Intro_feat._Gucci_Mane.mp3",
                3.36,R.drawable.migos_intro);
        ArtistSong TooBlessed = new ArtistSong("image2",
                "Too Blessed",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240009372561480/Migos_Quavo__Take_Off_Rich_The_Kid_-_Too_Blessed.mp3",
                3.21,R.drawable.migos_too_blessed);
        ArtistSong WorkHard = new ArtistSong("image3",
                "Work Hard",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240056592039946/Migos_-_Work_Hard.mp3",
                5.19,R.drawable.migos_work_hard);
        ArtistSong Vaccine = new ArtistSong("image4",
                "Vaccine",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240073830629376/Migos_-_Vaccine.mp3",
                3.42,R.drawable.migos_vaccine);
        ArtistSong Supastars = new ArtistSong("image5",
                " Supastars",
                "Migos",
                "https://cdn.discordapp.com/attachments/865599440189653062/871240108811092018/Migos_-_Supastars.mp3",
                4.55,R.drawable.migos_superstars);
        migossongs.add(Intro);
        migossongs.add(TooBlessed);
        migossongs.add(WorkHard);
        migossongs.add(Vaccine);
        migossongs.add(Supastars);
        artistsong.add(migossongs);
        //Migos Songs

        ArtistSong x = new ArtistSong("Image1",
                "X",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249412855308308/21_Savage__Metro_Boomin_ft._Future_-_X_.mp3",
                4.18,R.drawable.twentyonesavage_x);
        ArtistSong GhostFaceKillers = new ArtistSong("Image2",
                "GhostFace Killers",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249449287032842/21_Savage_ft._Travis_Scott_Offset__Metro_Boomin_-_Ghostface_Killers.mp3",
                4.29,R.drawable.twentyonesavage_ghostface_killers);
        ArtistSong GucciOnMy = new ArtistSong("Image3",
                "Gucci On My",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249479414730772/Migos_ft._21_Savage_YGMike_WiLL_Made-It_-_Gucci_On_My_.mp3",
                4.35,R.drawable.twentyonesavage_gucci_on_my);
        ArtistSong SavageMode = new ArtistSong("Image4",
                "Savage Mode",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249527758282782/21_Savage__Metro_Boomin_-_Savage_Mode.mp3",
                4.09,R.drawable.twentyonesavage_savage_mode);
        ArtistSong Tiffany = new ArtistSong("Image5",
                "Tiffany",
                "21 Savage",
                "https://cdn.discordapp.com/attachments/865599440189653062/871249541733683210/21_Savage_ft._Offset__Tyga_-_Tiffany.mp3",
                4.09,R.drawable.twentyonesavage_tiffany);
        twentyonesavagesongs.add(x);
        twentyonesavagesongs.add(GhostFaceKillers);
        twentyonesavagesongs.add(GucciOnMy);
        twentyonesavagesongs.add(SavageMode);
        twentyonesavagesongs.add(Tiffany);
        artistsong.add(twentyonesavagesongs);
        //21Savage Songs

        ArtistSong Life = new ArtistSong("image1",
                "Life",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258137297059901/Desiigner_-_Liife_ft._Gucci_Mane.mp3",
                3.17, R.drawable.gucci_mane_life);
        ArtistSong SolcyBoyz3 = new ArtistSong("image2",
                "SolcyBoyz",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258153843560468/Gucci_Mane_ft._Big_ScarrPooh_Shiesty__Foogiano_-_SoIcyBoyz_3.mp3",
                3.33, R.drawable.gucci_mane_solcyboyz3);
        ArtistSong MetGala = new ArtistSong("image3",
                "Met Gala",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258161246507009/Gucci_Mane_ft._Offset_-_Met_Gala.mp3",
                3.33, R.drawable.gucci_mane_met_gala);
        ArtistSong SemiOnEm = new ArtistSong("image4",
                "Semi On 'Em",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258174278230057/Gucci_Mane_ft.Chief_Keef_-_Semi_On_Em.mp3",
                2.51, R.drawable.gucci_mane_semi_on__em);
        ArtistSong DifferentGame = new ArtistSong("image5",
                "Different Game",
                "Gucci Mane",
                "https://cdn.discordapp.com/attachments/865599440189653062/871258191097368626/Jackson_Wang_-_Different_Game_ft._Gucci_Mane.mp3",
                3.08, R.drawable.gucci_mane_different_game);
        guccimanesongs.add(Life);
        guccimanesongs.add(SolcyBoyz3);
        guccimanesongs.add(MetGala);
        guccimanesongs.add(SemiOnEm);
        guccimanesongs.add(DifferentGame);
        artistsong.add(guccimanesongs);
        //GucciMane Songs

        ArtistSong Boombayah = new ArtistSong("image1",
                "Boombayah",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263077142790184/BLACKPINK_-_BOOMBAYAH.mp3",
                3.08, R.drawable.blackpink_boombayah);
        ArtistSong Dududu = new ArtistSong("image2",
                "Dududu",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263089310437416/BLACKPINK_-_DDU-DU_DDU-DU.mp3",
                3.08, R.drawable.blackpink_dududu);
        ArtistSong KillThisLove = new ArtistSong("image3",
                "Kill This Love",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263115394842624/BLACKPINK_-_Kill_This_Love.mp3",
                3.08, R.drawable.blackpink_kill_this_love);
        ArtistSong PlayingWithFire = new ArtistSong("image4",
                "Playing With Fire",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263143840583730/BLACKPINK_-_PLAYING_WITH_FIRE.mp3",
                3.08, R.drawable.blackpink_playing_with_fire);
        ArtistSong KissAndMakeup = new ArtistSong("image5",
                "Kiss and Makeup",
                "BlackPink",
                "https://cdn.discordapp.com/attachments/865599440189653062/871263208621613106/BLACKPINK__Dua_Lipa_-_Kiss_and_Make_Up.mp3",
                3.08, R.drawable.blackpink_kiss_and_makeup);

        blackpinksongs.add(Boombayah);
        blackpinksongs.add(Dududu);
        blackpinksongs.add(KillThisLove);
        blackpinksongs.add(PlayingWithFire);
        blackpinksongs.add(KillThisLove);
        artistsong.add(blackpinksongs);
        //Blackpink Songs

        ArtistSong TT = new ArtistSong("image1",
                "TT",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266567420268544/Twice-_TT.mp3",
                3.34, R.drawable.twice_tt);
        ArtistSong GoodPerson = new ArtistSong("image2",
                "GoodPerson",
                "Mina(Twice)",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266636680810517/Twice_Mina_-_Good_Person.mp3",
                4.29, R.drawable.twice_mina_good_person);
        ArtistSong Fancy = new ArtistSong("image3",
                "Fancy",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266696181219338/TWICE_-_FANCY.mp3",
                3.27, R.drawable.twice_fancy);
        ArtistSong FeelSpecial= new ArtistSong("image4",
                "Feel Special",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266715445624862/TWICE_-_Feel_Special.mp3",
                3.36, R.drawable.twice_feel_special);
        ArtistSong YouInMyHeart= new ArtistSong("image5",
                "You In My Heart",
                "Twice",
                "https://cdn.discordapp.com/attachments/865599440189653062/871266836681981972/TwiceTwicetagram_-_YOU_IN_MY_HEART.mp3",
                3.29, R.drawable.twice_you_in_my_heart);
        twicesongs.add(TT);
        twicesongs.add(GoodPerson);
        twicesongs.add(Fancy);
        twicesongs.add(FeelSpecial);
        twicesongs.add(YouInMyHeart);
        artistsong.add(twicesongs);
        //Twice Songs
    }
}
