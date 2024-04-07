package com.example.playstore;

import java.io.Serializable;

public class ChildModel implements Serializable {
    int id;
    String appname;
    String appdescription;
    String appstorage;

    public ChildModel(int id, String appname, String appdescription, String appstorage) {
        this.id = id;
        this.appname = appname;
        this.appdescription = appdescription;
        this.appstorage = appstorage;
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

    public String getAppdescription() {
        return appdescription;
    }

    public void setAppdescription(String appdescription) {
        this.appdescription = appdescription;
    }

    public String getAppstorage() {
        return appstorage;
    }

    public void setAppstorage(String appstorage) {
        this.appstorage = appstorage;
    }
}
