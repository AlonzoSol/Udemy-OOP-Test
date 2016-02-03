package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
public class Hamburger {
    private String name;
    private String roll;
    private String meat;
    private Additional add1;
    private Additional add2;
    private Additional add3;
    private Additional add4;
    private double price;
    private double addPrice;
    private double finalPrice;

    //constructor, passes hamburger name and price to setInfo
    public Hamburger(String roll, String meat) {
        this.roll = roll;
        this.meat = meat;
        setInfo("Hamburger", 6.5);
    }

    //creates Additional items for burgers
    public void itemize(Additional a, Additional b, Additional c, Additional d) {
        add1 = a;
        add2 = b;
        add3 = c;
        add4 = d;
        addPrice = a.getPrice() + b.getPrice() + c.getPrice() + d.getPrice();
    }

    //Updates the final price
    public void setFinalPrice(double addPrice) {
        finalPrice = addPrice + finalPrice;
    }

    //sets name, price, and finalPrice
    public void setInfo(String name, double price) {
        this.name = name;
        this.price = price;
        this.finalPrice = price;
    }

    //Returns string listing the burger, roll, meat, base price and final price for the burger
    public String receipt() {
        return "\nYou ordered a " + name + " with a " + roll + " roll and a " + meat + " patty for $" + price + ". Your total price is $" + finalPrice + ".\n";
    }

    //sets the final price, adds the new Additional prices, prints Additional info and calls receipt
    public void addCharge() {
        setFinalPrice(addPrice);
        System.out.println("For additionals you selected:\n" + add1.getAddInfo() + add2.getAddInfo() + add3.getAddInfo() +
                add4.getAddInfo() + receipt());
    }

    //calls addCharge
    public void charge() {
        addCharge();
    }

    //getter
    public String getName() {
        return name;
    }
}
