package com.seeksolution.altbalaji.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seeksolution.altbalaji.R;
import com.seeksolution.altbalaji.models.UserModel6;

import java.util.ArrayList;

public class CustomUserRecylerAdapter6 extends RecyclerView.Adapter<CustomUserRecylerAdapter6.ViewHolder> {
    public Context context;
    ArrayList<UserModel6> userModel_arr6;

    public CustomUserRecylerAdapter6(Context context, ArrayList<UserModel6> userModel_arr6) {
        this.context = context;
        this.userModel_arr6 = userModel_arr6;
    }

    @NonNull
    @Override
    public CustomUserRecylerAdapter6.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.mycustom1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomUserRecylerAdapter6.ViewHolder holder, int position) {
   holder.imageView.setImageResource(userModel_arr6.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userModel_arr6.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_rc);
        }
    }
}
