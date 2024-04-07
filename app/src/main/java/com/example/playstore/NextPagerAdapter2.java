package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NextPagerAdapter2 extends RecyclerView.Adapter<NextPagerAdapter2.ViewHolder> {
    ArrayList<popularModel> arrayList;

    public NextPagerAdapter2(ArrayList<popularModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public NextPagerAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.griditems,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NextPagerAdapter2.ViewHolder holder, int position) {
        holder.gridname.setText(arrayList.get(position).getAppname());
        holder.gridimage.setImageResource(arrayList.get(position).getId());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView gridname;
        ImageView gridimage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gridname=itemView.findViewById(R.id.gridname);
            gridimage=itemView.findViewById(R.id.gridimage);
        }
    }
}
