package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */
//Derived class for Sauce, all Sauces are $0.25
public class Sauce extends Additional {
    public Sauce(String name) {
        super(name, .25);
    }
}
//ketchup additional
class Ketchup extends Sauce {
    public Ketchup() {
        super("Ketchup");
    }
}
//mayo additional
class Mayo extends Sauce {
    public Mayo() {
        super("Mayo");
    }
}
//BBQ additional
class BBQ extends Sauce {
    public BBQ() {
        super("BBQ");
    }
}