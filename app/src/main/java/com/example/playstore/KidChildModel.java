package com.example.playstore;

public class KidChildModel {
    int id;
    String appname;
    String apprating;

    public KidChildModel(int id, String appname, String apprating) {
        this.id = id;
        this.appname = appname;
        this.apprating = apprating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getApprating() {
        return apprating;
    }

    public void setApprating(String apprating) {
        this.apprating = apprating;
    }
}
