package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class KidsFragment extends Fragment {
    private RecyclerView recyclerView;

    private ArrayList<KidParentModel> kidparentModelArrayList;
    private ArrayList<KidChildModel> kidChildModelArrayList;
    private ArrayList<KidChildModel> newandupdated;
    private ArrayList<KidChildModel> recommended;



      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          return inflater.inflate(R.layout.fragment_kids, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findid(view);
        kidparentModelArrayList=new ArrayList<>();
        kidChildModelArrayList=new ArrayList<>();
        newandupdated=new ArrayList<>();
        recommended=new ArrayList<>();

        kidChildModelArrayList.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
        kidChildModelArrayList.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));
        kidparentModelArrayList.add(new KidParentModel("New & Updated",kidChildModelArrayList));

        newandupdated.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
        newandupdated.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        newandupdated.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
        newandupdated.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));
        newandupdated.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
        newandupdated.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        newandupdated.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
       newandupdated.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));
       kidparentModelArrayList.add(new KidParentModel("Recommended For You",newandupdated));


       recommended.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
       recommended.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        recommended.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
        recommended.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));
       recommended.add(new KidChildModel(R.drawable.toddler,"Toddler Games","4.2"));
        recommended.add(new KidChildModel(R.drawable.tocaboca,"Toca Boca","4.2"));
        recommended.add(new KidChildModel(R.drawable.timpy,"Timpy Cooking Games","4.0"));
        recommended.add(new KidChildModel(R.drawable.youtue,"You Tube Kids","4.2"));

        kidparentModelArrayList.add(new KidParentModel("Games You might like",recommended));
        KidParentAdapter kidParentAdapter=new KidParentAdapter(getContext(),kidparentModelArrayList);
        recyclerView.setAdapter(kidParentAdapter);



    }

    private void findid(View view) {
        recyclerView=view.findViewById(R.id.kids_rv);
    }
}