package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ForyouAdapter extends RecyclerView.Adapter<ForyouAdapter.ViewHolder> {
    private ArrayList<ForyouModel> arrayList;
    public ForyouAdapter(ArrayList<ForyouModel> arrayList)
    {
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ForyouAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ForyouAdapter.ViewHolder holder, int position) {
        holder.appimage.setImageResource(arrayList.get(position).getId());
        holder.appname.setText(arrayList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView appimage;
        public TextView appname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            appimage=itemView.findViewById(R.id.appimage);
            appname=itemView.findViewById(R.id.appname);
        }
    }
}
