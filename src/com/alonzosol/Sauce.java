package com.alonzosol;

/**
 * Created by Alonzo on 2/1/2016.
 */
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