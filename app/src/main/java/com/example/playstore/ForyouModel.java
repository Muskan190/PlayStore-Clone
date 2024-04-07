package com.example.playstore;

import java.io.Serializable;

public class ForyouModel implements Serializable {
    int id;
    String text;
    public ForyouModel(int id,String text)
    {
        this.id=id;
        this.text=text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
