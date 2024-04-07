package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class TopchartsFragment extends Fragment {

    String spinnerdata[]={"Action","Adventure","Arcade","Board","Card","Casino","Casual","Educational"};
    private Spinner spinner;
    private RecyclerView topchartrecycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_topcharts, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findid(view);
    }
    private void findid(View view) {
        spinner=view.findViewById(R.id.spinner);
        topchartrecycler=view.findViewById(R.id.topchartrecycler);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,spinnerdata);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        ArrayList<TopChartModel> arrayList1=TopchartArrayList.topchartdata();

        TopChartAdapter topChartAdapter=new TopChartAdapter(getContext(),arrayList1);
        topchartrecycler.setAdapter(topChartAdapter);
    }
}