package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModel1;

import java.util.ArrayList;

public class CustomUserRecylerAdapter1 extends RecyclerView.Adapter<CustomUserRecylerAdapter1.ViewHolder> {
    public ArrayList<UserModel1> userModel_arr1;
    public Context context;

    public CustomUserRecylerAdapter1(Context context ,ArrayList<UserModel1> userModel_arr1) {
        this.userModel_arr1 = userModel_arr1;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(userModel_arr1.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return userModel_arr1.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.img_rc);
        }
    }
}
