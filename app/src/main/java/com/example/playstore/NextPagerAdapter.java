package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NextPagerAdapter extends RecyclerView.Adapter<NextPagerAdapter.ViewHolder> {
    private ArrayList<ForyouModel> arrayList;

    public NextPagerAdapter(ArrayList<ForyouModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public NextPagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.griditems,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NextPagerAdapter.ViewHolder holder, int position) {
        holder.gridimage.setImageResource(arrayList.get(position).getId());
        holder.gridname.setText(arrayList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gridimage;
        public TextView gridname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gridimage=itemView.findViewById(R.id.gridimage);
            gridname=itemView.findViewById(R.id.gridname);
        }
    }
}
