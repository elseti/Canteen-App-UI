package com.example.mycanteensutd_1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
//This class basically instantiates each stall_button.xml and displays them in a Recyclerview. Refer to RecyclerView documentation for more.

public class StallButtonAdapter extends RecyclerView.Adapter<StallButtonAdapter.ButtonViewHolder>{
    private List<Stall> stallList= new ArrayList<>();
    private Activity activity;


    public StallButtonAdapter(List<Stall> stallList, Activity activity){
        this.stallList.addAll(stallList);
        this.activity= activity;
    }

    public static class ButtonViewHolder extends RecyclerView.ViewHolder{
        private Button stallButton;
        //What else do you want for the button? Can put here and implement in the other methods
        public ButtonViewHolder(@NonNull View itemView){
            super(itemView);
            stallButton= itemView.findViewById(R.id.stallButton);
        }
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= activity.getLayoutInflater().inflate(R.layout.stall_button, parent,false);
        ButtonViewHolder bvh= new StallButtonAdapter.ButtonViewHolder(v);
        return bvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        holder.stallButton.setText(stallList.get(position).getName());

        holder.stallButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //intent to open StallMenu
                Intent intent= new Intent(activity, StallMenu.class);
                intent.putExtra("stallId", (int) stallList.get(position).getStallId()); //passes stall ID of button clicekd
                intent.putExtra("storeName", stallList.get(position).getName()); //passes stall name of button clicked
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return stallList.size();
    }
}
