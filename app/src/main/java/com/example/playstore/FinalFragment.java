package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FinalFragment extends Fragment {
    private RecyclerView gridrecyclerview3;
    private TextView textgames3;
    private ImageView tollbar_back3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_final, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textgames3=view.findViewById(R.id.textgames3);
        gridrecyclerview3=view.findViewById(R.id.gridrecyclerview3);
        tollbar_back3=view.findViewById(R.id.tollbar_back3);
        String txt=this.getArguments().getString("title");
        ArrayList<ChildModel> arrayList= (ArrayList<ChildModel>) this.getArguments().getSerializable("parentarray");
        textgames3.setText(txt);
        FinalAdapter finalAdapter=new FinalAdapter(getContext(),arrayList);
        gridrecyclerview3.setAdapter(finalAdapter);
        tollbar_back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  requireActivity().onBackPressed();

            }
        });



    }
}