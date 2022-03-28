package com.example.mycanteensutd_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CaiFanMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<MenuItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cai_fan_menu);

        //test list containing MenuItem objects
        foodList= new ArrayList<MenuItem>();

        Drawable brocDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.broccoli);
        Drawable eggDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.friedegg);
        Drawable porkDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.sweetsourpork);
        Drawable chickenDraw= ContextCompat.getDrawable(getApplicationContext(), R.drawable.chicken);

        foodList.add(new MenuItem("Sauteed Broccoli", 100, "Very nice broccoli", brocDraw, true));
        foodList.add(new MenuItem("Fried Egg", 100, "Fresh egg from chicken farm", eggDraw, false));
        foodList.add(new MenuItem("Sweet and Sour Pork", 100, "Pork from Australia", porkDraw, true));
        foodList.add(new MenuItem("Fried Chicken", 100, "Chicken attaaaaaaaaack", chickenDraw, false));

        //the list can be separate for different stalls respectively
        //maybe foodList can be an array of array of stall foods (each element= array of foods from that stall)
        
        //Recycler view instantiations
        recyclerView= findViewById(R.id.foodRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        //retrieve array in String resources
        //List<MenuItem> foodList= Arrays.asList(getResources().getStringArray(R.array.foodNames));

        //Instantiate FoodAdapter, an adapter for recyclerView
        FoodAdapter adapter= new FoodAdapter(foodList, this);
        recyclerView.setAdapter(adapter);






    }
}