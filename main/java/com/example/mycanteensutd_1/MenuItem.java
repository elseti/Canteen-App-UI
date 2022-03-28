package com.example.mycanteensutd_1;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MenuItem {

    private String foodName;
    private String foodDescription;
    private Drawable foodImage; //drawable cuz if imageview im not sure how to put it in an imageview object
    private double price; //not sure if u wanna put the price
    private long stallId;
    private boolean available;

    //constructor with only foodName and stallID
    public MenuItem(String foodName, long stallId){
        this.foodName= foodName;
        foodDescription= "";
        foodImage= null;
        price= 0; //not sure if want to include price as a variable
        this.stallId= stallId;
        available= true;

    }
    //constructor with foodName, stallID and description
    public MenuItem(String foodName, long stallId, String foodDescription){
        this.foodName= foodName;
        this.foodDescription= foodDescription;
        foodImage= null;
        price= 0; //not sure if want to include price as a variable
        this.stallId= stallId;

    }

    //constructor with foodName, stallID, description, image and availability
    public MenuItem(String foodName, long stallId, String foodDescription, Drawable foodImage, boolean available){
        this.foodName= foodName;
        this.foodDescription= foodDescription;
        this.foodImage= foodImage;
        price= 0; //not sure if want to include price as a variable
        this.stallId= stallId;
        this.available= available;

    }



    public String getFoodName(){return foodName;}
    public void setFoodName(String name){this.foodName= foodName;}

    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}

    public String getFoodDescription(){return foodDescription;}
    public void setFoodDescription(String foodDescription){this.foodDescription=foodDescription;}

    public long getStallId(){return stallId;}
    public void setStallId(long stallId){this.stallId=stallId;}

    public Drawable getFoodImage(){return foodImage;}
    public void setFoodImage(Drawable foodImage){this.foodImage=foodImage;}

    public boolean getAvailability(){return available;}
    public void setAvailability(boolean available){this.available= available;}



}
