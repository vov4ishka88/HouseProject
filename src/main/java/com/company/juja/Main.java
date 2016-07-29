package com.company.juja;

import com.company.juja.staff.Housemaid;
import com.company.juja.staff.RoboCleaner;

public class Main {

    public static void main(String[] args) {

        House house = new House(8, 3);

        Owner owner1 = new Owner("Steven.Bob");
        Owner owner2 = new Owner("Selena.Pupkin");
        Owner owner3 = new Owner("Jack.Mikel");
        Owner owner4 = new Owner("John.Doe");
        Owner owner5 = new Owner("Bob.Marley");
        Housemaid housemaid = new Housemaid("Eva.MarleyHouse");

        house.addCleaner(housemaid);
        house.addCleaner(housemaid);
        house.addCleaner(new RoboCleaner("Rob1"));
        house.addCleaner(new RoboCleaner("Rob2"));
        house.addCleaner(new RoboCleaner("Rob3"));
        house.addCleaner(new RoboCleaner("Rob4"));
        house.addCleaner(new RoboCleaner("Rob5"));
        house.addCleaner(new RoboCleaner("Rob6"));


        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(housemaid);

        System.out.print(house.toString());

        /*
        SimpleHouse simpleHouse = new SimpleHouse(16, 4);
        System.out.println(simpleHouse.toString());
        */
    }
}
