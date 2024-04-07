package com.example.playstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KidParentAdapter extends RecyclerView.Adapter<KidParentAdapter.ViewHolder> {
    Context context;
    ArrayList<KidParentModel> arrayList;

    public KidParentAdapter(Context context, ArrayList<KidParentModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public KidParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.parentlayouttwo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull KidParentAdapter.ViewHolder holder, int position) {
        holder.kidparenttitle.setText(arrayList.get(position).getTitle());
        KidChildAdapter kidChildAdapter=new KidChildAdapter(context, (ArrayList<KidChildModel>) arrayList.get(position).getList());
        holder.kidchildrecyclerview.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        PagerSnapHelper snapHelper=new PagerSnapHelper();
        snapHelper.attachToRecyclerView(holder.kidchildrecyclerview);
        holder.kidchildrecyclerview.setAdapter(kidChildAdapter);
        kidChildAdapter.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView kidparenttitle;
        RecyclerView kidchildrecyclerview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            kidparenttitle=itemView.findViewById(R.id.kidparenttitle);
            kidchildrecyclerview=itemView.findViewById(R.id.kidchildrecyclerview);
        }
    }
}
