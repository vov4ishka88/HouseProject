package com.company.juja.staff;

import com.company.juja.apartment.Apartment;

/**
 * Created by vov4i on 7/27/2016.
 */
public class RoboCleaner implements Cleaner {


    private String name;

    public RoboCleaner(String name) {
        this.name = name;
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("RoBoBoBo " + name + "Clean");
        System.out.println("Cleaning done!");
        System.out.println("****************************");
    }
}
