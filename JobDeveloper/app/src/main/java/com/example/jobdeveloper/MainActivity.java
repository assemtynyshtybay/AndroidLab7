package com.example.jobdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = findViewById(R.id.tabs);
        tabs.getTabAt(0).setIcon(R.drawable.ic_book);
        tabs.getTabAt(1).setIcon(R.drawable.ic_fav);
        tabs.getTabAt(2).setIcon(R.drawable.ic_more);
        //добавляем наш fragment jobs
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment, FragJobs.newInstance())
                    .commit();
        }
    }
}
