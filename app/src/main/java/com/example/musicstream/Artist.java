package com.example.musicstream;

public class Artist {
    private String id;
    private String title;
    private int drawable;

    public Artist (String id, String title, int drawable)
    {
        this.id = id;
        this.title = title;
        this.drawable = drawable;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setDrawable(int drawable)
    {
        this.drawable = drawable;
    }

    public String getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public int getDrawable()
    {
        return drawable;
    }
}
