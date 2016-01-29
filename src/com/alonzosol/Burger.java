package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */
//field
public class Burger {
    private String roll;
    private String meat;
    private double price;
    private double finalPrice;

    //constructor
    public Burger(String roll, String meat, double price) {
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.finalPrice = price;
    }

    //Updates the final price
    public void setFinalPrice(double addPrice) {
        finalPrice = addPrice + finalPrice;
    }

    //Returns string listing the burger, roll, meat, base price and final price for the burger
    public String receipt(String burg) {
        return "\nYou ordered a " + burg + " with a " + roll + " roll and a " + meat + " patty for $" + price + ". Your total price is $" + finalPrice + ".";
    }

    //Prints receipt if order is a plain burger
    public void charge() {
        System.out.println("You chose a plain burger." + receipt("Burger"));
    }
}
