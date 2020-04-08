package com.example.jobdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
