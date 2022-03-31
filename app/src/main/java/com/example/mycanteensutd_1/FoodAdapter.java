package com.example.mycanteensutd_1;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

//    private List<String> foodList; //List storing the food list (of a store or the entire thing?)
//    private List<String> foodDescription;

    private Activity activity;
    private List<MenuItem> menuList= new ArrayList<>();
    //private int stallIdClicked;

    //FoodAdapter constructor
    public FoodAdapter(List<MenuItem> menuList, Activity activity){
        this.menuList.addAll(menuList);
        this.activity= activity;
    }

    //FoodViewHolder class
    public static class FoodViewHolder extends RecyclerView.ViewHolder{
        public TextView foodName;
        public TextView foodDescription;
        public ImageView foodImage;
        public TextView studentPrice;
        public TextView publicPrice;
        public TextView studentPriceText;
        public TextView publicPriceText;
        //public ImageView foodImage; //to implement later
        public FoodViewHolder(@NonNull View itemView){
            super(itemView);
            foodName= itemView.findViewById(R.id.foodName);
            foodDescription= itemView.findViewById(R.id.foodDescription);
            foodImage= itemView.findViewById(R.id.foodImage);
            studentPrice= itemView.findViewById(R.id.studentPrice);
            publicPrice= itemView.findViewById(R.id.publicPrice);
            studentPriceText= itemView.findViewById(R.id.studentPriceText);
            publicPriceText= itemView.findViewById(R.id.publicPriceText);
        }

    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //creates a text view object from food_item xml
        //TextView textView= (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);

        View v= activity.getLayoutInflater().inflate(R.layout.food_item, parent,false);
        FoodViewHolder fvh= new FoodViewHolder(v);
        return fvh;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        MenuItem currMenu= menuList.get(position);
        holder.foodName.setText(currMenu.getFoodName());
        holder.foodDescription.setText(currMenu.getFoodDescription());
        holder.foodImage.setImageDrawable(currMenu.getFoodImage());
        holder.publicPrice.setText(""+currMenu.getPublicPrice());
        holder.studentPrice.setText(""+currMenu.getStudentPrice());

        //changes opacity if not available
        if(currMenu.getAvailability()==false){
            holder.foodImage.setAlpha((float) 0.4);
            holder.foodDescription.setAlpha((float) 0.4);
            holder.foodName.setAlpha((float) 0.4);
            holder.publicPrice.setAlpha((float) 0.4);
            holder.studentPrice.setAlpha((float) 0.4);
            holder.publicPriceText.setAlpha((float) 0.4);
            holder.studentPriceText.setAlpha((float) 0.4);
        }
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

}
