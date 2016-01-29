package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */
//fields
public class DeluxeBurger extends Burger {
    private Additional addInclude1;
    private Additional addInclude2;

    //constructor
    public DeluxeBurger(String roll, String meat) {
        super(roll, meat, 8.50);
        this.addInclude1 = new Fries();
        this.addInclude2 = new Soda();
    }

    //overrides charge specific for deluxe burger
    @Override
    public void charge() {
        System.out.println("Your DeluxeBurger comes with:\n" + addInclude1.getIncInfo() + addInclude2.getIncInfo() + receipt("DeluxeBurger"));
    }
}
