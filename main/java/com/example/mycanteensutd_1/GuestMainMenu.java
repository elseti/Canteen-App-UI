package com.example.mycanteensutd_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GuestMainMenu extends AppCompatActivity {
    private Button indianButton;
    private Button healthySoupButton;
    private Button caiFanButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guest_main_menu);

        //declare buttons
        indianButton= findViewById(R.id.indianButton);
        healthySoupButton= findViewById(R.id.healthySoupButton);
        caiFanButton= findViewById(R.id.caiFanButton);

        //bind buttons to activity layout
        //To implement: indian and healthy soup button

        //when caiFanButton is clicked, it will open CaiFanMenu
        caiFanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(GuestMainMenu.this, CaiFanMenu.class);
                startActivity(intent);
            }
        });



    }
}
