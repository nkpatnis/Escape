package com.escape.tna.escape.model;

/**
 * Created by nikhil on 3/4/2016.
 */
public class Feed {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String title = null;
    private int id = 0;

    public Feed(String title, int id) {
        this.title = title;
        this.id = id;
    }

    private String desc = "Vishakhapatnam (Vizag) is Andhra Pradesh's second largest city, and is known best for its beaches along the long shoreline. Flanked by rolling greens with the occasional naval ship on the horizon";
}
