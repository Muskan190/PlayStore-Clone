package com.example.playstore;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    Context context;
    ArrayList<ChildModel> arrayList;

    public ChildAdapter(Context context, ArrayList<ChildModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, int position) {
        ChildModel childModel=arrayList.get(position);
        holder.childimage.setImageResource(arrayList.get(position).getId());
        holder.childtext1.setText(arrayList.get(position).getAppname());
        holder.childtext2.setText(arrayList.get(position).getAppdescription());
        holder.childstorage.setText(arrayList.get(position).getAppstorage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new GameFragment();
                Bundle bundle=new Bundle();
                bundle.putSerializable("serail",childModel);
                fragment.setArguments(bundle);
                ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction().replace(android.R.id.content,fragment).addToBackStack(null).commit();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder alertdialog=new AlertDialog.Builder(context);
                alertdialog.setTitle("Delete App");
                alertdialog.setMessage("Are you Sure You want to delete?");
                alertdialog.setCancelable(false);
                alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int getposition= holder.getAdapterPosition();
                        arrayList.remove(getposition);
                        notifyItemRemoved(getposition);

                    }
                });

                alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();


                    }
                });
                alertdialog.show();

                return true;
            }
        });

    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView childimage;
        TextView childtext1,childtext2,childstorage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            childimage=itemView.findViewById(R.id.childimage);
            childtext1=itemView.findViewById(R.id.childtext1);
            childtext2=itemView.findViewById(R.id.childtext2);
            childstorage=itemView.findViewById(R.id.childstorage);
        }
    }
}
