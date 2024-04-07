package com.example.playstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KidChildAdapter extends RecyclerView.Adapter<KidChildAdapter.ViewHolder> {
    private Context context;
    private ArrayList<KidChildModel> arrayList;

    public KidChildAdapter(Context context, ArrayList<KidChildModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public KidChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayouttwo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull KidChildAdapter.ViewHolder holder, int position) {
        holder.kidappimage.setImageResource(arrayList.get(position).getId());
        holder.kidappname.setText(arrayList.get(position).getAppname());
        holder.kidrating.setText(arrayList.get(position).getApprating());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView kidappimage;
        public TextView kidappname,kidrating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            kidappimage=itemView.findViewById(R.id.kidappimage);
            kidappname=itemView.findViewById(R.id.kidappname);
            kidrating=itemView.findViewById(R.id.kidrating);
        }
    }
}
