package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    private ArrayList<popularModel> arrayList;
    public PopularAdapter(ArrayList<popularModel> arrayList)
    {
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public PopularAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.popularapplistitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder, int position) {
        holder.imageview2.setImageResource(arrayList.get(position).getId());
        holder.textview1.setText(arrayList.get(position).getAppname());
        holder.textview3.setText(arrayList.get(position).getAppdesc());
        holder.storage.setText(arrayList.get(position).getStorage());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageview2;
        public TextView textview1,textview3,storage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview2=itemView.findViewById(R.id.imageview2);
            textview1=itemView.findViewById(R.id.textview1);
            textview3=itemView.findViewById(R.id.textview3);
            storage=itemView.findViewById(R.id.storage);
        }

    }
}
