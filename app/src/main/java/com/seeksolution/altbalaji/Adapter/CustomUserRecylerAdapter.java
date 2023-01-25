package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModels;

import java.util.ArrayList;

public class CustomUserRecylerAdapter extends RecyclerView.Adapter<CustomUserRecylerAdapter.ViewHolder> {
    ArrayList<UserModels> userModels_arr;
    private Context context;

    public CustomUserRecylerAdapter(Context context ,ArrayList<UserModels> userModels_arr) {
        this.userModels_arr = userModels_arr;
        this.context =context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.mycustom,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.imageView.setImageResource(userModels_arr.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userModels_arr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.rc_img);
        }
    }
}
