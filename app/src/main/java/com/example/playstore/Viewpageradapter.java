package com.example.playstore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Viewpageradapter extends FragmentPagerAdapter {
    public Viewpageradapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return new ForyouFragment();
        }
        else if(position==1)
        {
            return new TopchartsFragment();
        } else if (position==2) {
            return new KidsFragment();
        }
        else {
            return new CategoriesFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "For you";
        }
        else if(position==1)
        {
            return "Top Charts";
        }
        else if(position==2)
        {
            return "Kids";
        }
        else
        {
            return "Categories";
        }
    }
}
