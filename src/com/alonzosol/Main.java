package com.alonzosol;

public class Main {

    public static void main(String[] args) {
        //Prints out menu/cashier babble
        System.out.println("Hello, welcome to Bills Burgers. Please select a burger type:");
        System.out.println("Hamburger (up to 4 additionals), Healthy Burger (2 additionals included, up to 6)," +
                " Deluxe Burger(fries and soda included)");
        System.out.println("Additionals we offer: Fries, Soda, Cheese, Lettuce, Pickles, Onions, Ketchup, Mayo, BBQ Sauce, or \"None\" for no additional");

        //Creates one of each type of burger. No user interface however you can change the Additionals
        //through the itemize methods below
        Hamburger one = new Hamburger("Sesame", "beef");
        one.itemize(new Cheese(), new Fries(), new BBQ(), new Onions());
        HealthyBurger two = new HealthyBurger("turkey");
        two.itemize(new Fries(), new Pickles(), new Soda(), new Mayo(), new None(), new None());
        DeluxeBurger three = new DeluxeBurger("Wheat", "chicken");
        one.charge();
        two.charge();
        three.charge();
    }
}
