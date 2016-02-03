package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
public class HealthyBurger extends Hamburger {
    private Additional addInclude1;
    private Additional addInclude2;

    //constructor, passes Healthyburger name and price to setInfo
    public HealthyBurger(String meat) {
        super("Brown Rye", meat);
        setInfo("HealthyBurger", 7);
    }

    //two extra Additionals for included ones
    public void itemize(Additional a, Additional b, Additional c, Additional d, Additional e, Additional f) {
        addInclude1 = a;
        addInclude2 = b;
        super.itemize(c, d, e, f);
    }

    //sets info specific to HealthyBurger
    @Override
    public void setInfo(String name, double price) {
        super.setInfo(name, price);
    }

    //Prints for included Additionals and calls addCharge
    @Override
    public void charge() {
        System.out.println("For included additionals you selected:\n" + addInclude1.getIncInfo()
                + addInclude2.getIncInfo());
        addCharge();
    }
}
