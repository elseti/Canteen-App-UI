package com.example.mycanteensutd_1;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MenuItem {

    private String foodName;
    private String foodDescription;
    private Drawable foodImage; //drawable cuz if imageview im not sure how to put it in an imageview object; can change it to bitmap tho, but need to change the FoodAdapter setImageDrawable
    private double studentPrice;
    private double publicPrice;
    private long stallId;
    private boolean available;

    //only one constructor for now, can make more if you want
    //constructor with foodName, stallID, description, image, availability, studentPrice, publicPrice
    public MenuItem(String foodName, long stallId, String foodDescription, Drawable foodImage, boolean available, double studentPrice, double publicPrice){
        this.foodName= foodName;
        this.foodDescription= foodDescription;
        this.foodImage= foodImage;
        this.stallId= stallId;
        this.available= available;
        this.studentPrice= studentPrice;
        this.publicPrice= publicPrice;
    }



    public String getFoodName(){return foodName;}
    public void setFoodName(String name){this.foodName= foodName;}

    public String getFoodDescription(){return foodDescription;}
    public void setFoodDescription(String foodDescription){this.foodDescription=foodDescription;}

    public long getStallId(){return stallId;}
    public void setStallId(long stallId){this.stallId=stallId;}

    public Drawable getFoodImage(){return foodImage;}
    public void setFoodImage(Drawable foodImage){this.foodImage=foodImage;}

    public boolean getAvailability(){return available;}
    public void setAvailability(boolean available){this.available= available;}

    public double getStudentPrice(){return studentPrice;}
    public void setStudentPrice(double studentPrice){this.studentPrice= studentPrice;}

    public double getPublicPrice(){return publicPrice;}
    public void setPublicPrice(double publicPrice){this.publicPrice= publicPrice;}

}
