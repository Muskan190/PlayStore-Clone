package com.example.playstore;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopChartAdapter extends RecyclerView.Adapter<TopChartAdapter.ViewHolder> {
    Context context;
    private ArrayList<TopChartModel> arrayList;

    public TopChartAdapter(Context context,ArrayList<TopChartModel> arrayList) {
        this.arrayList = arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public TopChartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.topchartlistitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopChartAdapter.ViewHolder holder, int position) {
        TopChartModel topChartModel=arrayList.get(position);
        holder.topchartimage.setImageResource(arrayList.get(position).getId());
        holder.topchartnumber.setText(arrayList.get(position).getNum());
        holder.topchartappname.setText(arrayList.get(position).getAppname());
        holder.topchartappdesc.setText(arrayList.get(position).getAppdesc());
        holder.topchartstorage.setText(arrayList.get(position).getAppstorage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new GameFragment();
                Bundle bundle=new Bundle();
                bundle.putSerializable("hello",topChartModel);
                fragment.setArguments(bundle);
                ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fragment).addToBackStack(null).commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView topchartimage;
        TextView topchartnumber,topchartappname,topchartappdesc,topchartstorage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topchartimage=itemView.findViewById(R.id.topchartimage);
            topchartnumber=itemView.findViewById(R.id.topchartnumber);
            topchartappname=itemView.findViewById(R.id.topchartappname);
            topchartappdesc=itemView.findViewById(R.id.topchartappdesc);
            topchartstorage=itemView.findViewById(R.id.topchartstorage);
        }
    }
}
