package com.alonzosol;

/**
 * Created by Alonzo on 1/28/2016.
 */
//Derived class for Solids, all Solids cost $0.50
public class Solid extends Additional {
    public Solid(String name) {
        super(name, 0.5);
    }
}
//lettuce additional
class Lettuce extends Solid {
    public Lettuce() {
        super("Lettuce");
    }
}
//cheese additional
class Cheese extends Solid {
    public Cheese() {
        super("Cheese");
    }
}
//onion additional
class Onions extends Solid {
    public Onions() {
        super("Onions");
    }
}
//pickle additional
class Pickles extends Solid {
    public Pickles() {
        super("Pickles");
    }
}
