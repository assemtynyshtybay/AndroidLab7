package com.example.jobdeveloper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragSaved extends Fragment {

    View v;

    private RecyclerView myrecyclerv;
    private ArrayList<Job> saveds;


    public FragSaved(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v=inflater.inflate(R.layout.frag_saved, container, false);
        myrecyclerv = v.findViewById(R.id.saveds);
        JobAdapter recyclerViewAdapter=new JobAdapter(getContext(), saveds);
        myrecyclerv.setLayoutManager(new LinearLayoutManager(getActivity()));

        myrecyclerv.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        saveds = new ArrayList<>();

    }
}
