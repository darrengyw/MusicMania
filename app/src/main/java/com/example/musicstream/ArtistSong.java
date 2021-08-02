package com.example.musicstream;

public class ArtistSong {
    private String id;
    private String artistsongtitle;
    private String artistname;
    private String fileLink;
    private double songLength;
    private int drawable;

    public ArtistSong(String id, String artistsongtitle, String artistname, String fileLink, double songLength,int drawable)
    {
        this.id = id;
        this.artistsongtitle = artistsongtitle;
        this.artistname = artistname;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.drawable = drawable;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setArtistsongtitle (String artistsongtitle)
    {
        this.artistsongtitle = artistsongtitle;
    }

    public void setArtistname (String artistname)
    {
        this.artistname = artistname;
    }

    public void setFileLink(String fileLink)
    {
        this.fileLink = fileLink;
    }

    public void setSongLength(double songLength)
    {
        this.songLength = songLength;
    }

    public void setDrawable (int drawable)
    {
        this.drawable = drawable;
    }

    public String getId()
    {
        return id;
    }
    public String getArtistsongtitle()
    {
        return artistsongtitle;
    }
    public String getArtistname()
    {
        return artistname;
    }
    public String getFileLink()
    {
        return fileLink;
    }
    public double getSongLength()
    {
        return songLength;
    }
    public int getDrawable()
    {
        return drawable;
    }
}
