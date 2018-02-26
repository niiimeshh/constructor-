package com.nimesh;

public class Main {

    public static void main(String[] args) {
	    Animal Cow = new Animal("Setu", 1,1, 4,200);
        //System.out.println(Cow.getName());


        Dog Rockey = new Dog("Pappu", 1, 1,2, 4, 1, 24, "Silky");
        //Rockey.eat();

        Rockey.walk();
       // Rockey.run();

        //Rockey.move(5);

        Fish Gold = new Fish("Rahu", 4, 5,3,6,2);

        Gold.swim(5);

    }
}
