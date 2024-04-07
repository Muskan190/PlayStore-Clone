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
public class NextpageFragment extends Fragment {
    private TextView textgames,text2;
    private ImageView tollbar_back;
    private RecyclerView gridrecyclerview,getGridrecyclerview2;
      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nextpage, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textgames=view.findViewById(R.id.textgames);
        tollbar_back=view.findViewById(R.id.tollbar_back);

        gridrecyclerview=view.findViewById(R.id.gridrecyclerview);

        String txt=this.getArguments().getString("typeofgame");
        //ArrayList<popularModel> arrayList2= (ArrayList<popularModel>) this.getArguments().getSerializable("arraylist2");
        ArrayList<ForyouModel> arrayList = (ArrayList<ForyouModel>) this.getArguments().getSerializable("arraylist");

            textgames.setText(txt);
            NextPagerAdapter nextPagerAdapter=new NextPagerAdapter(arrayList);
            gridrecyclerview.setAdapter(nextPagerAdapter);

            tollbar_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    requireActivity().onBackPressed();
                }
            });

      }
}