package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistSongCollection {
    SongCollection songCollection = new SongCollection();
    List<List> artistsong = new ArrayList<>();                      //ArrayList for Artist Song
    List<ArtistSong> arianagrandesongs = new ArrayList<>();        //Ariana Grande Song
    List<ArtistSong> migossongs = new ArrayList<>();              //Migos Song
    List<ArtistSong> twentyonesavagesongs = new ArrayList<>();   //21 Savage Song
    List<ArtistSong> guccimanesongs = new ArrayList<>();        //Gucci Mane Song
    List<ArtistSong> blackpinksongs = new ArrayList<>();        //Blackpink Song
    List<ArtistSong> twicesongs = new ArrayList<>();           //Twice Song

    public ArtistSongCollection() {
        ArtistSong ThirtyFourThirtyFive = new ArtistSong(songCollection.songs[6]);
        ArtistSong Bloodline = new ArtistSong(songCollection.songs[7]);
        ArtistSong GodIsAWoman = new ArtistSong(songCollection.songs[8]);
        ArtistSong Position = new ArtistSong(songCollection.songs[9]);
        ArtistSong Sometimes = new ArtistSong(songCollection.songs[10]);
        arianagrandesongs.add(ThirtyFourThirtyFive);
        arianagrandesongs.add(Bloodline);
        arianagrandesongs.add(GodIsAWoman);
        arianagrandesongs.add(Position);
        arianagrandesongs.add(Sometimes);
        artistsong.add(arianagrandesongs); //add artistsong array into list
        //Ariana Grande Song
        ArtistSong Intro = new ArtistSong(songCollection.songs[11]);
        ArtistSong TooBlessed = new ArtistSong(songCollection.songs[12]);
        ArtistSong WorkHard = new ArtistSong(songCollection.songs[13]);
        ArtistSong Vaccine = new ArtistSong(songCollection.songs[14]);
        ArtistSong Supastars = new ArtistSong(songCollection.songs[15]);
        migossongs.add(Intro);
        migossongs.add(TooBlessed);
        migossongs.add(WorkHard);
        migossongs.add(Vaccine);
        migossongs.add(Supastars);
        artistsong.add(migossongs); //add artistsong array into list
        //Migo Songs
        ArtistSong x = new ArtistSong(songCollection.songs[16]);
        ArtistSong GhostFaceKillers = new ArtistSong(songCollection.songs[17]);
        ArtistSong GucciOnMy = new ArtistSong(songCollection.songs[18]);
        ArtistSong SavageMode = new ArtistSong(songCollection.songs[19]);
        ArtistSong Tiffany = new ArtistSong(songCollection.songs[20]);
        twentyonesavagesongs.add(x);
        twentyonesavagesongs.add(GhostFaceKillers);
        twentyonesavagesongs.add(GucciOnMy);
        twentyonesavagesongs.add(SavageMode);
        twentyonesavagesongs.add(Tiffany);
        artistsong.add(twentyonesavagesongs); //add artistsong array into list
        //21Savage Songs
        ArtistSong Life = new ArtistSong(songCollection.songs[21]);
        ArtistSong SolcyBoyz3 = new ArtistSong(songCollection.songs[22]);
        ArtistSong MetGala = new ArtistSong(songCollection.songs[23]);
        ArtistSong SemiOnEm = new ArtistSong(songCollection.songs[24]);
        ArtistSong DifferentGame = new ArtistSong(songCollection.songs[25]);
        guccimanesongs.add(Life);
        guccimanesongs.add(SolcyBoyz3);
        guccimanesongs.add(MetGala);
        guccimanesongs.add(SemiOnEm);
        guccimanesongs.add(DifferentGame);
        artistsong.add(guccimanesongs); //add artistsong array into list
        //GucciMane Songs
        ArtistSong Boombayah = new ArtistSong(songCollection.songs[26]);
        ArtistSong Dududu = new ArtistSong(songCollection.songs[27]);
        ArtistSong KillThisLove = new ArtistSong(songCollection.songs[28]);
        ArtistSong PlayingWithFire = new ArtistSong(songCollection.songs[29]);
        ArtistSong KissAndMakeup = new ArtistSong(songCollection.songs[30]);
        blackpinksongs.add(Boombayah);
        blackpinksongs.add(Dududu);
        blackpinksongs.add(KillThisLove);
        blackpinksongs.add(PlayingWithFire);
        blackpinksongs.add(KissAndMakeup);
        artistsong.add(blackpinksongs); //add artistsong array into list
        //Blackpink Songs
        ArtistSong TT = new ArtistSong(songCollection.songs[31]);
        ArtistSong GoodPerson = new ArtistSong(songCollection.songs[32]);
        ArtistSong Fancy = new ArtistSong(songCollection.songs[33]);
        ArtistSong FeelSpecial = new ArtistSong(songCollection.songs[34]);
        ArtistSong YouInMyHeart = new ArtistSong(songCollection.songs[35]);
        twicesongs.add(TT);
        twicesongs.add(GoodPerson);
        twicesongs.add(Fancy);
        twicesongs.add(FeelSpecial);
        twicesongs.add(YouInMyHeart);
        artistsong.add(twicesongs); //add artistsong array into list
        //Twice Songs
    }

}
