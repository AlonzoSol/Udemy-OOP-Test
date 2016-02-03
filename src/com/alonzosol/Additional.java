package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
//Base class for additionals with name and price field/constructor
public class Additional {
    private String name;
    private double price;

    public Additional(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //public method for getting addtional's name and price
    public String getAddInfo() {
        return "Additional: " + name + ". Price : $" + price + ".\n";
    }

    //public method for getting included additional's name and price
    public String getIncInfo() {
        return "Additional: " + name + ". Price : $" + price + " **INCLUDED**.\n";
    }

    //getter
    public double getPrice() {
        return price;
    }
}

//class for if no additional
class None extends Additional {
    public None() {
        super("NONE", 0);
    }
}