package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModel4;

import java.util.ArrayList;

public class CustomUserRecylerAdapter4 extends RecyclerView.Adapter<CustomUserRecylerAdapter4.ViewHolder> {
    ArrayList<UserModel4> userModel_arr4;
    public Context context;

    public CustomUserRecylerAdapter4(Context context, ArrayList<UserModel4> userModel_arr4) {
        this.context = context;
        this.userModel_arr4 = userModel_arr4;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.imageView.setImageResource(userModel_arr4.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userModel_arr4.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.img_rc);
        }
    }
}
