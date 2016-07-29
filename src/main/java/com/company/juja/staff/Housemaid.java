package com.company.juja.staff;

import com.company.juja.Owner;
import com.company.juja.apartment.Apartment;
import com.company.juja.staff.Cleaner;

/**
 * Created by vov4i on 7/27/2016.
 */
public class Housemaid extends Owner implements Cleaner {

    public Housemaid(String name) {
        super(name);
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment " + apartment.getNumber());
        System.out.println("Cleaning done by " + name);
        System.out.println("******************");
    }
}
