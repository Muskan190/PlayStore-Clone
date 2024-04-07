package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
public class ForyouFragment extends Fragment {
    private RecyclerView recyclerview,recyclerview2,rv_parent;
    private ImageSlider image_slider;
    private TextView textviewrecent,textviewrecent2;
    private ArrayList<SlideModel> arrayListslide=new ArrayList<>();

    private ArrayList<ParentModel> parentModelArrayList;
    private ArrayList<ChildModel> childModelArrayList;
    private ArrayList<ChildModel> recommended;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_foryou, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findid(view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);

        ArrayList<ForyouModel> arrayList=ForYouArrayList.getalldata();
        ForyouAdapter foryouAdapter=new ForyouAdapter(arrayList);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(foryouAdapter);

        recyclerview2.setLayoutManager(new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL,false));

        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerview2);
          ArrayList<popularModel> arrayList1=PopularArrayList.newgetappdata();
          PopularAdapter popularAdapter=new PopularAdapter(arrayList1);
          recyclerview2.setAdapter(popularAdapter);

          arrayListslide.add(new SlideModel(R.drawable.bikerace, "Bike Race",ScaleTypes.FIT));
          arrayListslide.add(new SlideModel(R.drawable.hillclim,"Hill Climb Racing",ScaleTypes.FIT));
          arrayListslide.add(new SlideModel(R.drawable.driveahead,"Drive Ahead",ScaleTypes.FIT));
          image_slider.setImageList(arrayListslide);



          parentModelArrayList=new ArrayList<>();
          childModelArrayList=new ArrayList<>();
          recommended=new ArrayList<>();

          childModelArrayList.add(new ChildModel(R.drawable.goodpizza,"Good Pizza, Great Pizza","Become the pizza master in this fun cooking","190 MB"));
          childModelArrayList.add(new ChildModel(R.drawable.plantandzombie,"Plants vs. Zombies","Stem a zombie attack on your yard with the help of plants","94 MB"));
          childModelArrayList.add(new ChildModel(R.drawable.trafficrider,"Traffic Rider","The Next-Gen of Endless Motorbike Racing","110 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.goodpizza,"Good Pizza, Great Pizza","Become the pizza master in this fun cooking","190 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.plantandzombie,"Plants vs. Zombies","Stem a zombie attack on your yard with the help of plants","94 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.trafficrider,"Traffic Rider","The Next-Gen of Endless Motorbike Racing","110 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.goodpizza,"Good Pizza, Great Pizza","Become the pizza master in this fun cooking","190 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.plantandzombie,"Plants vs. Zombies","Stem a zombie attack on your yard with the help of plants","94 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.trafficrider,"Traffic Rider","The Next-Gen of Endless Motorbike Racing","110 MB"));

          parentModelArrayList.add(new ParentModel("Casual Games",childModelArrayList));

          recommended.add(new ChildModel(R.drawable.brainitout,"Brain It On!","Deceptively challenging physics puzzles for your brain","52 MB"));
          recommended.add(new ChildModel(R.drawable.math,"Math |Riddle and Puzzle","Puzzle","30 MB"));
          recommended.add(new ChildModel(R.drawable.ok,"Okay?","Casual","70 MB"));
        recommended.add(new ChildModel(R.drawable.brainitout,"Brain It On!","Deceptively challenging physics puzzles for your brain","52 MB"));
        recommended.add(new ChildModel(R.drawable.math,"Math |Riddle and Puzzle","Puzzle","30 MB"));
        recommended.add(new ChildModel(R.drawable.ok,"Okay?","Casual","70 MB"));
        recommended.add(new ChildModel(R.drawable.brainitout,"Brain It On!","Deceptively challenging physics puzzles for your brain","52 MB"));
        recommended.add(new ChildModel(R.drawable.math,"Math |Riddle and Puzzle","Puzzle","30 MB"));
        recommended.add(new ChildModel(R.drawable.ok,"Okay?","Casual","70 MB"));
        parentModelArrayList.add(new ParentModel("Puzzle games",recommended));
          ParentAdapter parentAdapter=new ParentAdapter(getContext(),parentModelArrayList);
          rv_parent.setLayoutManager(new LinearLayoutManager(getContext()));
          rv_parent.setAdapter(parentAdapter);
        //-----------------------------------------------------------------------------------------------------------------------
        textviewrecent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new NextpageFragment();
                Bundle bundle=new Bundle();
                bundle.putString("typeofgame",textviewrecent.getText().toString());
                bundle.putSerializable("arraylist",arrayList);
                fragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fragment).addToBackStack(null).commit();
            }
        });
        textviewrecent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new NextPager2Fragment();
                Bundle bundle=new Bundle();
                bundle.putString("premium",textviewrecent2.getText().toString());
                bundle.putSerializable("arraylist2",arrayList1);
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fragment).addToBackStack(null).commit();
            }
        });

    }
    private void findid(View view) {
        recyclerview=view.findViewById(R.id.recyclerview);
        recyclerview2=view.findViewById(R.id.recyclerview2);
        image_slider=view.findViewById(R.id.image_slider);
        rv_parent=view.findViewById(R.id.rv_parent);
        textviewrecent=view.findViewById(R.id.textviewrecent);
        textviewrecent2=view.findViewById(R.id.textviewrecent2);
    }
}