package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModel3;

import java.util.ArrayList;

public class CustomUserRecylerAdapter3 extends RecyclerView.Adapter<CustomUserRecylerAdapter3.ViewHolder> {
    public Context context;
    ArrayList<UserModel3> usermodel_arr3;

    public CustomUserRecylerAdapter3(Context context, ArrayList<UserModel3> usermodel_arr3) {
        this.context = context;
        this.usermodel_arr3 = usermodel_arr3;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.imageView.setImageResource(usermodel_arr3.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return usermodel_arr3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.img_rc);
        }
    }
}
