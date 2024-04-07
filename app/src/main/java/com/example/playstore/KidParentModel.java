package com.example.playstore;

import java.util.List;

public class KidParentModel {
    String title;
    List<KidChildModel> list;

    public KidParentModel(String title, List<KidChildModel> list) {
        this.title = title;
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<KidChildModel> getList() {
        return list;
    }

    public void setList(List<KidChildModel> list) {
        this.list = list;
    }
}
