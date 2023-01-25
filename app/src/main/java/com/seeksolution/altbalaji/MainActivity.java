package com.seeksolution.altbalaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.HorizontalScrollView;

import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter1;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter2;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter3;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter4;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter5;
import com.seeksolution.altbalaji.Adapter.CustomUserRecylerAdapter6;
import com.seeksolution.altbalaji.models.UserModel1;
import com.seeksolution.altbalaji.models.UserModel3;
import com.seeksolution.altbalaji.models.UserModel4;
import com.seeksolution.altbalaji.models.UserModel5;
import com.seeksolution.altbalaji.models.UserModel6;
import com.seeksolution.altbalaji.models.UserModels;
import com.seeksolution.altbalaji.models.Usermodel2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private RecyclerView recyclerView;
     private RecyclerView recyclerView1;
     private RecyclerView recyclerView2;
     private RecyclerView recyclerView3;
     private RecyclerView recyclerView4;
     private RecyclerView recyclerView5;
     private RecyclerView recyclerView6;
 ArrayList<UserModels> userModels_arr =new ArrayList<UserModels>();
 ArrayList<UserModel1> userModel_arr1 =new ArrayList<UserModel1>();
 ArrayList<Usermodel2> usermodel_arr2 =new ArrayList<Usermodel2>();
 ArrayList<UserModel3> usermodel_arr3 =new ArrayList<UserModel3>();
 ArrayList<UserModel4> userModel_arr4 =new ArrayList<UserModel4>();
 ArrayList<UserModel5> userModel_arr5 =new ArrayList<UserModel5>();
 ArrayList<UserModel6> userModel_arr6=new ArrayList<UserModel6>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView) findViewById(R.id.rc_cart_view);
        recyclerView1 =(RecyclerView)findViewById(R.id.rc_cart_view1);
        recyclerView2 =(RecyclerView) findViewById(R.id.rc_cart_view2);
        recyclerView3 =(RecyclerView) findViewById(R.id.rc_cart_view3);
        recyclerView4 =(RecyclerView) findViewById(R.id.rc_cart_view4);
        recyclerView5 =(RecyclerView) findViewById(R.id.rc_cart_view5);
        recyclerView6 =(RecyclerView) findViewById(R.id.rc_cart_view6);
        userModels_arr.add(new UserModels(R.drawable.web1));
        userModels_arr.add(new UserModels(R.drawable.web2));
        userModels_arr.add(new UserModels(R.drawable.web3));
        userModels_arr.add(new UserModels(R.drawable.web4));
        userModels_arr.add(new UserModels(R.drawable.web5));
        userModels_arr.add(new UserModels(R.drawable.web6));
        userModels_arr.add(new UserModels(R.drawable.web7));

        userModel_arr1.add(new UserModel1(R.drawable.web4));
        userModel_arr1.add(new UserModel1(R.drawable.web6));
        userModel_arr1.add(new UserModel1(R.drawable.web5));
        userModel_arr1.add(new UserModel1(R.drawable.web3));
        userModel_arr1.add(new UserModel1(R.drawable.web1));
        userModel_arr1.add(new UserModel1(R.drawable.web2));
        userModel_arr1.add(new UserModel1(R.drawable.web7));
        usermodel_arr2.add(new Usermodel2(R.drawable.web3));

        usermodel_arr2.add(new Usermodel2(R.drawable.web6));
        usermodel_arr2.add(new Usermodel2(R.drawable.web5));
        usermodel_arr2.add(new Usermodel2(R.drawable.web3));
        usermodel_arr2.add(new Usermodel2(R.drawable.web1));
        usermodel_arr2.add(new Usermodel2(R.drawable.web2));
        usermodel_arr2.add(new Usermodel2(R.drawable.web7));
        usermodel_arr2.add(new Usermodel2(R.drawable.web3));
        usermodel_arr2.add(new Usermodel2(R.drawable.web1));
        usermodel_arr2.add(new Usermodel2(R.drawable.web6));
        usermodel_arr2.add(new Usermodel2(R.drawable.web5));
        usermodel_arr2.add(new Usermodel2(R.drawable.web3));
        usermodel_arr2.add(new Usermodel2(R.drawable.web1));
        usermodel_arr2.add(new Usermodel2(R.drawable.web2));
        usermodel_arr2.add(new Usermodel2(R.drawable.web7));
        usermodel_arr2.add(new Usermodel2(R.drawable.web3));
        usermodel_arr2.add(new Usermodel2(R.drawable.web1));

        usermodel_arr3.add(new UserModel3(R.drawable.web6));
        usermodel_arr3.add(new UserModel3(R.drawable.web5));
        usermodel_arr3.add(new UserModel3(R.drawable.web3));
        usermodel_arr3.add(new UserModel3(R.drawable.web1));
        usermodel_arr3.add(new UserModel3(R.drawable.web2));
        usermodel_arr3.add(new UserModel3(R.drawable.web7));
        usermodel_arr3.add(new UserModel3(R.drawable.web3));
        usermodel_arr3.add(new UserModel3(R.drawable.web1));
        usermodel_arr3.add(new UserModel3(R.drawable.web6));
        usermodel_arr3.add(new UserModel3(R.drawable.web5));
        usermodel_arr3.add(new UserModel3(R.drawable.web3));
        usermodel_arr3.add(new UserModel3(R.drawable.web1));
        usermodel_arr3.add(new UserModel3(R.drawable.web2));
        usermodel_arr3.add(new UserModel3(R.drawable.web7));
        usermodel_arr3.add(new UserModel3(R.drawable.web3));
        usermodel_arr3.add(new UserModel3(R.drawable.web1));

        userModel_arr4.add(new UserModel4(R.drawable.web6));
        userModel_arr4.add(new UserModel4(R.drawable.web5));
        userModel_arr4.add(new UserModel4(R.drawable.web3));
        userModel_arr4.add(new UserModel4(R.drawable.web1));
        userModel_arr4.add(new UserModel4(R.drawable.web2));
        userModel_arr4.add(new UserModel4(R.drawable.web7));
        userModel_arr4.add(new UserModel4(R.drawable.web3));
        userModel_arr4.add(new UserModel4(R.drawable.web1));
        userModel_arr4.add(new UserModel4(R.drawable.web6));
        userModel_arr4.add(new UserModel4(R.drawable.web5));
        userModel_arr4.add(new UserModel4(R.drawable.web3));
        userModel_arr4.add(new UserModel4(R.drawable.web1));
        userModel_arr4.add(new UserModel4(R.drawable.web2));
        userModel_arr4.add(new UserModel4(R.drawable.web7));
        userModel_arr4.add(new UserModel4(R.drawable.web3));
        userModel_arr4.add(new UserModel4(R.drawable.web1));

        userModel_arr5.add(new UserModel5(R.drawable.web4));
        userModel_arr5.add(new UserModel5(R.drawable.web6));
        userModel_arr5.add(new UserModel5(R.drawable.web5));
        userModel_arr5.add(new UserModel5(R.drawable.web3));
        userModel_arr5.add(new UserModel5(R.drawable.web1));
        userModel_arr5.add(new UserModel5(R.drawable.web2));
        userModel_arr5.add(new UserModel5(R.drawable.web7));
        userModel_arr5.add(new UserModel5(R.drawable.web3));
        userModel_arr5.add(new UserModel5(R.drawable.web4));
        userModel_arr5.add(new UserModel5(R.drawable.web6));
        userModel_arr5.add(new UserModel5(R.drawable.web5));
        userModel_arr5.add(new UserModel5(R.drawable.web3));
        userModel_arr5.add(new UserModel5(R.drawable.web1));
        userModel_arr5.add(new UserModel5(R.drawable.web2));
        userModel_arr5.add(new UserModel5(R.drawable.web7));
        userModel_arr5.add(new UserModel5(R.drawable.web3));

        userModel_arr6.add(new UserModel6(R.drawable.web6));
        userModel_arr6.add(new UserModel6(R.drawable.web5));
        userModel_arr6.add(new UserModel6(R.drawable.web3));
        userModel_arr6.add(new UserModel6(R.drawable.web1));
        userModel_arr6.add(new UserModel6(R.drawable.web2));
        userModel_arr6.add(new UserModel6(R.drawable.web7));
        userModel_arr6.add(new UserModel6(R.drawable.web3));
        userModel_arr6.add(new UserModel6(R.drawable.web1));
        userModel_arr6.add(new UserModel6(R.drawable.web6));
        userModel_arr6.add(new UserModel6(R.drawable.web5));
        userModel_arr6.add(new UserModel6(R.drawable.web3));
        userModel_arr6.add(new UserModel6(R.drawable.web1));
        userModel_arr6.add(new UserModel6(R.drawable.web2));
        userModel_arr6.add(new UserModel6(R.drawable.web7));
        userModel_arr6.add(new UserModel6(R.drawable.web3));
        userModel_arr6.add(new UserModel6(R.drawable.web1));
        CustomUserRecylerAdapter adapter=new CustomUserRecylerAdapter(getApplicationContext(),userModels_arr);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        CustomUserRecylerAdapter1 adapter1=new CustomUserRecylerAdapter1(getApplicationContext(),userModel_arr1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setAdapter(adapter1);
        CustomUserRecylerAdapter2 adapter2 =new CustomUserRecylerAdapter2(getApplicationContext(),usermodel_arr2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setAdapter(adapter2);
        CustomUserRecylerAdapter3 adapter3 =new CustomUserRecylerAdapter3(getApplicationContext(),usermodel_arr3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView3.setAdapter(adapter3);
        CustomUserRecylerAdapter4 adapter4 =new CustomUserRecylerAdapter4(getApplicationContext(),userModel_arr4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView4.setAdapter(adapter4);
        CustomUserRecylerAdapter5 adapter5=new CustomUserRecylerAdapter5(getApplicationContext(),userModel_arr5);
        recyclerView5.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView5.setAdapter(adapter5);
        CustomUserRecylerAdapter6 adapter6 =new CustomUserRecylerAdapter6(getApplicationContext(),userModel_arr6);
        recyclerView6.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView6.setAdapter(adapter6);


    }
}