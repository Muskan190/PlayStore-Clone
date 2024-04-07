package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class NextPager2Fragment extends Fragment {
    private RecyclerView gridrecyclerview2;
    private TextView textgames2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next_pager2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textgames2=view.findViewById(R.id.textgames2);
        gridrecyclerview2=view.findViewById(R.id.gridrecyclerview2);
        String txt=this.getArguments().getString("premium");
        ArrayList<popularModel> arrayList= (ArrayList<popularModel>) this.getArguments().getSerializable("arraylist2" );
        NextPagerAdapter2 nextPagerAdapter2=new NextPagerAdapter2(arrayList);
        textgames2.setText(txt);
        gridrecyclerview2.setAdapter(nextPagerAdapter2);

    }
}