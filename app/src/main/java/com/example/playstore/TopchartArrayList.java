package com.example.playstore;

import java.util.ArrayList;

public class TopchartArrayList {

    public static ArrayList<TopChartModel> arrayList=new ArrayList<>();
    public static ArrayList<TopChartModel> topchartdata()
    {
        arrayList.add(new TopChartModel("1",R.drawable.hillclim,"Hill Climb Racing","Racing Stunt driving Casual","597 MB"));
        arrayList.add(new TopChartModel("2",R.drawable.freefire,"Free fire Max","Action Tactical shooter","26 MB"));
        arrayList.add(new TopChartModel("3",R.drawable.hillclim,"Hill Climb Racing","Racing Stunt driving Casual","597 MB"));
        arrayList.add(new TopChartModel("4",R.drawable.freefire,"Free fire Max","Action Tactical shooter","26 MB"));
        arrayList.add(new TopChartModel("5",R.drawable.hillclim,"Hill Climb Racing","Racing Stunt driving Casual","597 MB"));
        arrayList.add(new TopChartModel("6",R.drawable.freefire,"Free fire Max","Action Tactical shooter","26 MB"));
        arrayList.add(new TopChartModel("7",R.drawable.hillclim,"Hill Climb Racing","Racing Stunt driving Casual","597 MB"));
        arrayList.add(new TopChartModel("8",R.drawable.freefire,"Free fire Max","Action Tactical shooter","26 MB"));
        arrayList.add(new TopChartModel("9",R.drawable.hillclim,"Hill Climb Racing","Racing Stunt driving Casual","597 MB"));
        arrayList.add(new TopChartModel("10",R.drawable.freefire,"Free fire Max","Action Tactical shooter","26 MB"));

        return arrayList;
    }
}
