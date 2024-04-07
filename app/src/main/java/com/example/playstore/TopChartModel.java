package com.example.playstore;

import java.io.Serializable;

public class TopChartModel implements Serializable {
    String num;
    int id;
    String appname,appdesc,appstorage;

    public TopChartModel(String num, int id, String appname, String appdesc, String appstorage) {
        this.num = num;
        this.id = id;
        this.appname = appname;
        this.appdesc = appdesc;
        this.appstorage = appstorage;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public String getAppdesc() {
        return appdesc;
    }

    public void setAppdesc(String appdesc) {
        this.appdesc = appdesc;
    }

    public String getAppstorage() {
        return appstorage;
    }

    public void setAppstorage(String appstorage) {
        this.appstorage = appstorage;
    }
}
