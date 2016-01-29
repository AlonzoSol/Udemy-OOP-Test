package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */
//fields
public class Hamburger extends Burger{
    private Additional add1;
    private Additional add2;
    private Additional add3;
    private Additional add4;
    private double addPrice;

    //constructor
    public Hamburger(String roll, String meat, Additional add1, Additional add2, Additional add3, Additional add4) {
        super(roll, meat, 6.5);
        this.add1 = add1;
        this.add2 = add2;
        this.add3 = add3;
        this.add4 = add4;
        this.addPrice = add1.getPrice() + add2.getPrice() + add3.getPrice() + add4.getPrice();
    }

    //overrides charge, updates final price and prints all additionals info and the receipt
    @Override
    public void charge() {
        setFinalPrice(addPrice);
        System.out.println("For additionals you selected:\n" + add1.getAddInfo() + add2.getAddInfo() + add3.getAddInfo() +
                add4.getAddInfo() + receipt("Hamburger"));
    }
}
