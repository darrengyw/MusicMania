package com.example.musicstream;

public class GenreSong {
    private String id;
    private String genresongtitle;
    private String genrename;
    private String fileLink;
    private double songLength;
    private int drawable;

    public GenreSong(String id, String genresongtitle, String genrename, String fileLink, double songLength, int drawable)
    {
        this.id = id;
        this.genresongtitle = genresongtitle;
        this.genrename = genrename;
        this.fileLink = fileLink;
        this.songLength = songLength;
        this.drawable = drawable;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setGenresongtitle(String genresongtitle)
    {
        this.genresongtitle = genresongtitle;
    }
    public void setGenrename(String genrename)
    {
        this.genrename = genrename;
    }
    public void setFileLink(String fileLink)
    {
        this.fileLink = fileLink;
    }
    public void setSongLength(double songLength)
    {
        this.songLength = songLength;
    }
    public void setDrawable(int drawable)
    {
        this.drawable = drawable;
    }

    public String getId()
    {
        return id;
    }
    public String getGenresongtitle()
    {
        return genresongtitle;
    }
    public String getGenrename()
    {
        return genrename;
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
