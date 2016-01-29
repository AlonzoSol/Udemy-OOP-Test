package com.alonzosol;

public class Main {

    public static void main(String[] args) {
        //Prints out menu/cashier babble
        System.out.println("Hello, welcome to Bills Burgers. Please select a burger type:");
        System.out.println("Hamburger (up to 4 additionals), Healthy Burger (2 additionals included, up to 6)," +
                " Deluxe Burger(fries and soda included)");
        System.out.println("Rolls we offer: Wheat, Sesame, Brown Rye");
        System.out.println("Meat we offer: Beef, Chicken, Turkey");
        System.out.println("Additionals we offer: Fries, Soda, Cheese, Lettuce, Pickles, Onions, Ketchup, Mayo, BBQ Sauce, or \"None\" for no additional");
        Burger order = randomBurger();
        //prints out order (additionals, burger info, prices and final price)
        order.charge();

    }

    //generates a semi-random burger order due to no user interaction in project
    public static Burger randomBurger() {
        //generates a number between 1-3
        int randomNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNum + ".\n\n");
        //initializes additionals and burger type depending on randomNum
        if (randomNum == 1) {
            Cheese num1 = new Cheese();
            Ketchup num2 = new Ketchup();
            Soda num3 = new Soda();
            None num4 = new None();
            return new Hamburger("Sesame", "Beef", num1, num2, num3, num4);
        }
        else if (randomNum == 2) {
            Lettuce num1 = new Lettuce();
            Cheese num2 = new Cheese();
            Mayo num3 = new Mayo();
            Onions num4 = new Onions();
            Pickles num5 = new Pickles();
            BBQ num6 = new BBQ();
            return new HealthyBurger("Chicken", num1, num2, num3, num4, num5, num6);
        }
        else if (randomNum == 3) {
            return new DeluxeBurger("Wheat", "Turkey");
        }
        return null;
    }
}
