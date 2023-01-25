package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.icu.number.CompactNotation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.Usermodel2;

import java.util.ArrayList;
import java.util.logging.Handler;

public class CustomUserRecylerAdapter2 extends RecyclerView.Adapter<CustomUserRecylerAdapter2.ViewHolder> {
    ArrayList<Usermodel2> usermodel_arr2;
    private Context context;

    public CustomUserRecylerAdapter2(Context context, ArrayList<Usermodel2> usermodel_arr2) {
        this.usermodel_arr2 = usermodel_arr2;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomUserRecylerAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomUserRecylerAdapter2.ViewHolder holder, int position) {
        holder.imageView.setImageResource(usermodel_arr2.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return  usermodel_arr2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.img_rc);
        }
    }
}
