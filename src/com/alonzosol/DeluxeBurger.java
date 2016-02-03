package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
public class DeluxeBurger extends Hamburger{
    private Additional addInclude1;
    private Additional addInclude2;

    //constructor, passes Deluxeburger name and price to setInfo, itemizes Additionals as none automatically
    public DeluxeBurger(String roll, String meat) {
        super(roll, meat);
        this.addInclude1 = new Fries();
        this.addInclude2 = new Soda();
        setInfo("DeluxeBurger", 8.5);
        itemize(new None(), new None(), new None(), new None());
    }

    //sets info specific to DeluxeBurger
    @Override
    public void setInfo(String name, double price) {
        super.setInfo(name, price);
    }

    //Prints for DeluxeBurger auto-includes, calls addCharge
    @Override
    public void charge() {
        System.out.println("Your " + getName() + " comes with:\n" + addInclude1.getIncInfo() + addInclude2.getIncInfo());
        addCharge();
    }
}
