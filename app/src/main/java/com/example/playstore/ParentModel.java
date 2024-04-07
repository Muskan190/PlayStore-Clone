package com.example.playstore;

import java.io.Serializable;
import java.util.List;

public class ParentModel implements Serializable {
    String title;
    List<ChildModel> childModelList;

    public ParentModel(String title, List<ChildModel> childModelList) {
        this.title = title;
        this.childModelList = childModelList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ChildModel> getChildModelList() {
        return childModelList;
    }

    public void setChildModelList(List<ChildModel> childModelList) {
        this.childModelList = childModelList;
    }
}
