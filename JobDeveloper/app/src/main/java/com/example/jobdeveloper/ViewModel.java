package com.example.jobdeveloper;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewModel extends FragmentPagerAdapter {
    private final List<Fragment> listFrag= new ArrayList<>();
    private final List<String> listTitles=new ArrayList<>();

    public ViewModel(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        return listFrag.get(position);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitles.get(position);
    }

    @Override
    public int getCount() {
        return listTitles.size();
    }

    public void AddFragment(Fragment fragment, String title){
        listFrag.add(fragment);
        listTitles.add(title);
    }
}
