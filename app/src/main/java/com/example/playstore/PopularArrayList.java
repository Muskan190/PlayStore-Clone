package com.example.playstore;

import java.util.ArrayList;

public class PopularArrayList {
    public static ArrayList<popularModel> arrayList=new ArrayList<>();
    public static ArrayList<popularModel> newgetappdata()
    {
        arrayList.add(new popularModel(R.drawable.candy,"Candy Crush Saga","Puzzle match","85 MB"));
        arrayList.add(new popularModel(R.drawable.wordsofwonder,"Words of Wonders: Crossword", "Word Search Casual","165 MB"));
        arrayList.add(new popularModel(R.drawable.cooking,"Cooking Madness: A Chef's Game","Simulation Time Management Arcade","343 MB"));
        arrayList.add(new popularModel(R.drawable.candy,"Candy Crush Saga","Puzzle match","85 MB"));
        arrayList.add(new popularModel(R.drawable.wordsofwonder,"Words of Wonders: Crossword", "Word Search Casual","165 MB"));
        arrayList.add(new popularModel(R.drawable.cooking,"Cooking Madness: A Chef's Game","Simulation Time Management Arcade","343 MB"));
        arrayList.add(new popularModel(R.drawable.candy,"Candy Crush Saga","Puzzle match","85 MB"));
        arrayList.add(new popularModel(R.drawable.wordsofwonder,"Words of Wonders: Crossword", "Word Search Casual","165 MB"));
        arrayList.add(new popularModel(R.drawable.cooking,"Cooking Madness: A Chef's Game","Simulation Time Management Arcade","343 MB"));
        return arrayList;
    }
}
