package com.example.playstore;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder> {
    Context context;
    List<ParentModel> parentModelList;

    public ParentAdapter(Context context, List<ParentModel> parentModelList) {
        this.context = context;
        this.parentModelList = parentModelList;
    }

    @NonNull
    @Override
    public ParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.parentlayout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ParentAdapter.ViewHolder holder, int position) {
        holder.parenttitle.setText(parentModelList.get(position).getTitle());
        ChildAdapter childAdapter=new ChildAdapter(context, (ArrayList<ChildModel>) parentModelList.get(position).getChildModelList());
        holder.childrecyclerview.setLayoutManager(new GridLayoutManager(context,3,GridLayoutManager.HORIZONTAL,false));
        PagerSnapHelper snapHelper=new PagerSnapHelper();
        snapHelper.attachToRecyclerView(holder.childrecyclerview);
        holder.childrecyclerview.setAdapter(childAdapter);
        childAdapter.notifyDataSetChanged();
        int position1=position;


        holder.parenttitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new FinalFragment();
                Bundle bundle=new Bundle();
                bundle.putString("title",parentModelList.get(position1).getTitle());
                bundle.putSerializable("parentarray", (Serializable) parentModelList.get(position1).getChildModelList());
                fragment.setArguments(bundle);
                ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fragment).addToBackStack(null).commit();
            }
        });



    }

    @Override
    public int getItemCount() {
        return parentModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView parenttitle;
        RecyclerView childrecyclerview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parenttitle=itemView.findViewById(R.id.parenttitle);
            childrecyclerview=itemView.findViewById(R.id.childrecyclerview);
        }
    }
}
