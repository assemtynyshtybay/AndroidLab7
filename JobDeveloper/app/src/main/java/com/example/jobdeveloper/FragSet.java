package com.example.jobdeveloper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
//
public class FragSet extends Fragment {
    View v;

    public FragSet(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v=inflater.inflate(R.layout.frag_saved, container, false);
        return v;
    }
}
