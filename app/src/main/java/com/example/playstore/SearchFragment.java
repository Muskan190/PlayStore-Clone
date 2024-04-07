package com.example.playstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
public class SearchFragment extends Fragment {
    private AutoCompleteTextView autocomplete;
       String datalist[]={"Good Pizza, Great Pizza","Plants vs. Zombies","Traffic Rider","Brain It On!","Math |Riddle and Puzzle","Okay?"};
    ArrayList<ChildModel> childModelArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        autocomplete=view.findViewById(R.id.autocomplete);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,datalist);
        autocomplete.setAdapter(arrayAdapter);
        childModelArrayList=new ArrayList<>();
        childModelArrayList.add(new ChildModel(R.drawable.goodpizza,"Good Pizza, Great Pizza","Become the pizza master in this fun cooking","190 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.plantandzombie,"Plants vs. Zombies","Stem a zombie attack on your yard with the help of plants","94 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.trafficrider,"Traffic Rider","The Next-Gen of Endless Motorbike Racing","110 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.brainitout,"Brain It On!","Deceptively challenging physics puzzles for your brain","52 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.math,"Math |Riddle and Puzzle","Puzzle","30 MB"));
        childModelArrayList.add(new ChildModel(R.drawable.ok,"Okay?","Casual","70 MB"));
        autocomplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selecteditem= (String) adapterView.getItemAtPosition(i);
                for (ChildModel model : childModelArrayList) {
                    if (model.getAppname().equals(selecteditem)) {
                        Fragment fragment = new GameFragment();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("me", model);
                        fragment.setArguments(bundle);
                        getParentFragmentManager().beginTransaction()
                                .replace(android.R.id.content, fragment)
                                .addToBackStack(null)
                                .commit();
                        return;
                    }
                }
                // If no matching ChildModel is found for the selected item, show a toast
                Toast.makeText(getContext(), "No matching data found", Toast.LENGTH_SHORT).show();
                Log.d("SearchFragment", "Selected item: " + selecteditem);
            }
        });
    }
}