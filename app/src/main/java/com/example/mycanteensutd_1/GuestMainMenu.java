package com.example.mycanteensutd_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//view of the guest main menu where user clicks which stall they wanna see
public class GuestMainMenu extends AppCompatActivity {
    private List<Stall> stallList;
    private RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guest_main_menu);

        //Recycler view instantiations
        recyclerView= findViewById(R.id.stallButtonRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        //the buttons created depend on what's inside stallList
        //stallList is an arraylist of Stall objects.
        //stallList is hardcoded for now, but you should modify it later and replace this part.
        stallList= new ArrayList<Stall>();
        stallList.add(new Stall("Cai Fan", 100));
        stallList.add(new Stall("Healthy Soup", 200));
        stallList.add(new Stall("Indian", 300));

        //Instantiate StallButtonAdapter, an adapter for recyclerView
        StallButtonAdapter adapter= new StallButtonAdapter(stallList, this);
        recyclerView.setAdapter(adapter);

    }
}
