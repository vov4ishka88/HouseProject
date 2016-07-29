package com.company.juja.apartment;

import com.company.juja.equipment.Bucket;
import com.company.juja.equipment.Equipment;
import com.company.juja.equipment.Extinguisher;
import com.company.juja.equipment.Mop;

import java.util.Arrays;

/**
 * Created by vov4i on 7/23/2016.
 */
public class TechnicalApartment extends Apartment {

    //private int apartmentNumber; --> FIELD IS MOVED TO THE PARENT CLASS
    private final Equipment[] equipments;

    public TechnicalApartment(int apartmentNumber) {
        super(apartmentNumber);
        equipments = new Equipment[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Mop();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "With objects: " + Arrays.toString(equipments) + "\n";
    }
}
