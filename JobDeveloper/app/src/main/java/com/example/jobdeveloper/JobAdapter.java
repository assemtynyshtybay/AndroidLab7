package com.example.jobdeveloper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<Job> mData;

    public JobAdapter(Context mContext, ArrayList<Job> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.job_item,parent,false);
        final MyViewHolder vHolder=new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mon_name.setText(mData.get(position).getName());
        holder.mon_desc.setText(mData.get(position).getDescription());
        holder.mon_date.setText(mData.get(position).getDate());
        holder.mon_photo.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mon_name;
        private TextView mon_desc;
        private TextView mon_date;
        private ImageView mon_photo;
        public MyViewHolder(View itemView){
            super(itemView);

            mon_name= itemView.findViewById(R.id.job_name);
            mon_desc= itemView.findViewById(R.id.job_desc);
            mon_date= itemView.findViewById(R.id.job_date);
            mon_photo= itemView.findViewById(R.id.photo);


        }
    }
}
