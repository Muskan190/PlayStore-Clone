package com.example.playstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
public class MainActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager viewpager;
    private TextView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=findViewById(R.id.tablayout);
        viewpager=findViewById(R.id.viewpager);
        searchView=findViewById(R.id.searchview);
        Viewpageradapter viewpageradapter=new Viewpageradapter(getSupportFragmentManager());
        viewpager.setAdapter(viewpageradapter);
        tablayout.setupWithViewPager(viewpager);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(android.R.id.content,new SearchFragment()).addToBackStack(null).commit();
            }
        });



    }

}