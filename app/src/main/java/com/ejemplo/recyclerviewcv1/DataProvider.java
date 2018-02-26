package com.ejemplo.recyclerviewcv1;

/**
 * Created by lenovo on 21/02/2018.
 */

public class DataProvider {

    private String title;
    private String shortdesc;
    private String rating;
    private int image;



    public DataProvider(String title, String shortdesc, String rating, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;
    }




    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
