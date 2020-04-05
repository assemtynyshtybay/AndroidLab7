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

public class FragJobs extends Fragment {
    View v;

    public FragJobs(){

    }
    private RecyclerView myrecyclerv;


    private ArrayList<Job> jobs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        v=inflater.inflate(R.layout.frag_jobs, container, false);
        myrecyclerv = v.findViewById(R.id.jobs);
        JobAdapter recyclerViewAdapter=new JobAdapter(getContext(),jobs);
        myrecyclerv.setLayoutManager(new LinearLayoutManager(getActivity()));

        myrecyclerv.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jobs = new ArrayList<>();
        jobs.add(new Job(R.drawable.ic_photo,"Company name","Company description","date"));

    }
}
