package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
public class Side extends Additional {
    public Side(String name, double price) {
        super(name, price);
    }
}
//fries additional w/ price
class Fries extends Side {
    public Fries() {
        super("Fries", 2);
    }
}
//soda additional w/ price
class Soda extends Side {
    public Soda() {
        super("Soda", 1);
    }
}