package com.example.jobdeveloper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.MyViewHolder> {
    List<Job> jobs;
    private JobItemClickListener listener;
    //инициализируем переменные с помощью конструктура
    public JobAdapter(List<Job> jobs,  @Nullable JobItemClickListener listener){
        this.jobs=jobs;
        this.listener=listener;
    }
    //Создаем новые вюшки
    @NonNull
    @Override
    public JobAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.job_item, parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull JobAdapter.MyViewHolder holder, int position) {
        // получаем элемет из базы с помошью позиции
        // заменяем контент вюшки этим элементом
        final Job job=jobs.get(position);
        String image_src=job.getCompanyLogo();
        Picasso.get()
                .load(image_src)
                .placeholder(R.drawable.image_placeholder)
                .into(holder.itemLogo);
        //holder.itemLogo.setImageResource(job.getCompanyLogo());
        holder.itemTitle.setText(job.getTitle());
        holder.itemType.setText(job.getType());
        holder.itemCreatedAt.setText(job.getCreatedAt());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            //Чтобы показать детальную информацию
            @Override
            public void onClick(View v) {
                listener.itemClick(position, job);
            }
        });
    }
    //Возвращаем размер данных
    @Override
    public int getItemCount() {
        return jobs.size();
    }

    // Предоставляем ссылку на представления для каждого элемента данных
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView itemLogo;
        TextView itemTitle;
        TextView itemType;
        TextView itemCreatedAt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemLogo=itemView.findViewById(R.id.companyLogo);
            itemTitle=itemView.findViewById(R.id.title);
            itemType=itemView.findViewById(R.id.type);
            itemCreatedAt=itemView.findViewById(R.id.createdAt);
        }
    }
    public interface JobItemClickListener{
        void itemClick(int position, Job job);
    }
}
