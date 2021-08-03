package com.example.musicstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenreCollection {
    List<Genre> genre = new ArrayList<Genre>();
    private Genre genres[] = new Genre[4];

    public GenreCollection()
    {
        Genre japanesesong = new Genre("Image1",
                "Japanese Songs",
                R.drawable.japanesesongart);
        Genre englishsong = new Genre("Image2",
                "English Songs",
                R.drawable.english_songart);
        Genre chinesesong = new Genre("Image3",
                "Chinese Songs",
                R.drawable.chinese_songart);
        Genre koreansong = new Genre("Image4",
                "Korean Songs",
                R.drawable.korean_songart);

        genres[0] = japanesesong;
        genres[1] = englishsong;
        genres[2] = chinesesong;
        genres[3] = koreansong;

        genre.addAll(Arrays.asList(genres));
    }
    public List<Genre> getGenre()
    {
        return genre;
    }
}
