package com.example.musicstream;

public class Genre {
    private String id;
    private String genretitle;
    private int drawable;

    public Genre (String id, String genretitle, int drawable)
    {
        this.id = id;
        this.genretitle = genretitle;
        this.drawable = drawable;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setTitle(String title)
    {
        this.genretitle = title;
    }
    public void setDrawable(int drawable)
    {
        this.drawable = drawable;
    }

    public String getId()
    {
        return  id;
    }
    public String getGenretitle()
    {
        return genretitle;
    }
    public int getDrawable()
    {
        return drawable;
    }
}
