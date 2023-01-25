package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModel5;

import java.util.ArrayList;

public class CustomUserRecylerAdapter5 extends RecyclerView.Adapter<CustomUserRecylerAdapter5.ViewHolder> {
    public Context context;
    ArrayList<UserModel5> userModel_arr5;

    public CustomUserRecylerAdapter5(Context context, ArrayList<UserModel5> userModel_arr5) {
        this.context = context;
        this.userModel_arr5 = userModel_arr5;
    }

    @NonNull
    @Override
    public CustomUserRecylerAdapter5.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomUserRecylerAdapter5.ViewHolder holder, int position) {
  holder.imageView.setImageResource(userModel_arr5.get(position).getIamge());
    }

    @Override
    public int getItemCount() {
        return userModel_arr5.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.img_rc);
        }
    }
}
