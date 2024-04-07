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
public class FinalAdapter extends RecyclerView.Adapter<FinalAdapter.ViewHolder> {
    Context context;
    ArrayList<ChildModel> arrayList;

    public FinalAdapter(Context context, ArrayList<ChildModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public FinalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.griditems,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FinalAdapter.ViewHolder holder, int position) {
        ChildModel childModel=arrayList.get(position);
        holder.gridname.setText(arrayList.get(position).getAppname());
        holder.gridimage.setImageResource(arrayList.get(position).getId());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new GameFragment();
                Bundle bundle=new Bundle();
                bundle.putSerializable("hye",childModel);
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
        TextView gridname;
        ImageView gridimage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gridname=itemView.findViewById(R.id.gridname);
            gridimage=itemView.findViewById(R.id.gridimage);
        }
    }
}
