package com.example.mycanteensutd_1;

import java.util.ArrayList;

class Stall {
    private String name;
    private long stallId;
    private int openingTime;
    private int closingTime;
    //private ArrayList<Staff> staffMembers; //I haven't made Staff class; do implement
    private ArrayList<MenuItem> menuItems;
    private boolean open;

    public Stall(String name, long stallId){ //temporary constructor for testing.
        this.name= name;
        this.stallId= stallId;

    }
    public String getName(){return name;};
    public void setName(String name){this.name= name;};

    public long getStallId(){return stallId;};

    public int getOpeningTime(){return openingTime;};
    public void setOpeningTIme(int time){openingTime= time;};

    public int getClosingTime(){return closingTime;};
    public void setClosingTIme(int time){closingTime= time;};

//    public ArrayList<Staff> getStaffMembers();
//    public boolean setStaffMembers(ArrayList<Staff> staffMembers);

    public ArrayList<MenuItem> getMenuItems(){return menuItems;};

    public boolean isOpen(){return open;};
    public void setOpen(boolean open){this.open=open;};
}