package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */

//fields
public class HealthyBurger extends Burger{
    private Additional addInclude1;
    private Additional addInclude2;
    private Additional add1;
    private Additional add2;
    private Additional add3;
    private Additional add4;
    private double addPrice;

    //constructor
    public HealthyBurger(String meat, Additional addInclude1, Additional addInclude2, Additional add1, Additional add2, Additional add3, Additional add4) {
        super("Brown Rye", meat, 7);
        this.addInclude1 = addInclude1;
        this.addInclude2 = addInclude2;
        this.add1 = add1;
        this.add2 = add2;
        this.add3 = add3;
        this.add4 = add4;
        this.addPrice = add1.getPrice() + add2.getPrice() + add3.getPrice() + add4.getPrice();
    }

    //overrides charge, updates final price, prints included additionals with promo message, all additionals info and receipt
    @Override
    public void charge() {
        setFinalPrice(addPrice);
        System.out.println("For included additionals you selected:\n" + addInclude1.getIncInfo()
                + addInclude2.getIncInfo() + "\nFor additionals you selected:\n" + add1.getAddInfo()
                + add2.getAddInfo() + add3.getAddInfo() + add4.getAddInfo() + receipt("HealthyBurger"));
    }
}
