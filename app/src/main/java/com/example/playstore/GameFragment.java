package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameFragment extends Fragment {
    ImageView gameimageview2,tollbar_back4;
    TextView gametextview1,gametextview3,gamestorage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gameimageview2=view.findViewById(R.id.gameimageview2);
        gametextview1=view.findViewById(R.id.gametextview1);
        gametextview3=view.findViewById(R.id.gametextview3);
        gamestorage=view.findViewById(R.id.gamestorage);
        tollbar_back4=view.findViewById(R.id.tollbar_back4);

        ChildModel childModel= (ChildModel) this.getArguments().getSerializable("serail");
        if(childModel!=null)
        {
            gameimageview2.setImageResource(childModel.getId());
            gametextview1.setText(childModel.getAppname());
            gametextview3.setText(childModel.getAppdescription());
            gamestorage.setText(childModel.getAppstorage());

        }
        TopChartModel topChartModel= (TopChartModel) this.getArguments().getSerializable("hello");
        if(topChartModel!=null)
        {
            gameimageview2.setImageResource(topChartModel.getId());
            gametextview1.setText(topChartModel.getAppname());
            gametextview3.setText(topChartModel.getAppdesc());
            gamestorage.setText(topChartModel.getAppstorage());

        }
        ChildModel childModel1= (ChildModel) this.getArguments().getSerializable("hye");
        if(childModel1!=null)
        {
            gameimageview2.setImageResource(childModel1.getId());
            gametextview1.setText(childModel1.getAppname());
            gametextview3.setText(childModel1.getAppdescription());
            gamestorage.setText(childModel1.getAppstorage());

        }
        ChildModel childModel2= (ChildModel) this.getArguments().getSerializable("me");
        if(childModel2!=null)
        {
            gameimageview2.setImageResource(childModel2.getId());
            gametextview1.setText(childModel2.getAppname());
            gametextview3.setText(childModel2.getAppdescription());
            gamestorage.setText(childModel2.getAppstorage());

        }

        tollbar_back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().onBackPressed();
            }
        });

    }
}