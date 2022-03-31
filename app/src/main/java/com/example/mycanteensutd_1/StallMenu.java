package com.example.mycanteensutd_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

//This class displays the food in the stall clicked.
public class StallMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<MenuItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stall_menu);
        Intent intent= getIntent();
        int stallIdClicked= intent.getIntExtra("stallId", 0); //getExtra from StallButtonAdapter's intent call
        String stallNameClicked= intent.getStringExtra("storeName");

        //test list containing MenuItem objects.
        //Have to be replaced later on with the actual arraylist containing MenuItem objects
        foodList= new ArrayList<MenuItem>();

        //images are drawable here
        Drawable brocDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.broccoli);
        Drawable eggDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.friedegg);
        Drawable porkDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.sweetsourpork);
        Drawable chickenDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.chicken);

        foodList.add(new MenuItem("Sauteed Broccoli", 100, "Very nice broccoli", brocDraw, true, 2.00, 2.50));
        foodList.add(new MenuItem("Fried Egg", 100, "Fresh egg from chicken farm", eggDraw, false, 10.00, 20));
        foodList.add(new MenuItem("Sweet and Sour Pork", 100, "Pork from Australia", porkDraw, true, 4, 5));
        foodList.add(new MenuItem("Fried Chicken", 100, "Chicken attaaaaaaaaack", chickenDraw, false, 1,2));
        foodList.add(new MenuItem("Indian Chicken", 300, "chickeceince", chickenDraw, true, 3.5, 4));
        foodList.add(new MenuItem("Very Oily Pork", 200, "MMmM Oil", porkDraw, true, 2, 2.3));


        //Recycler view instantiations
        recyclerView= findViewById(R.id.foodRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        //filter foodList according to stallID passed in StallButtonAdapter (ex: if you click cai fan button, stall ID of 100 is passed)
        List<MenuItem> passedList= new ArrayList<MenuItem>();
        for(int x=0; x<foodList.size(); x++){
            if(foodList.get(x).getStallId()==stallIdClicked){
                passedList.add(foodList.get(x));
            }
        }
        //set store name
        TextView tv= findViewById(R.id.storeName);
        tv.setText(stallNameClicked);

        //Instantiate FoodAdapter, an adapter for recyclerView
        FoodAdapter adapter= new FoodAdapter(passedList, this);
        recyclerView.setAdapter(adapter);


    }
}