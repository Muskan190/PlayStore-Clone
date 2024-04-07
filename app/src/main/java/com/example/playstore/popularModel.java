package com.example.playstore;

public class popularModel {
    int id;
    String appname,appdesc,storage;
    public popularModel(int id,String appname,String appdesc,String storage)
    {
        this.id=id;
        this.appname=appname;
        this.appdesc=appdesc;
        this.storage=storage;
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

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
