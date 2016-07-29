package com.company.juja.apartment;

/**
 * Created by vov4i on 7/23/2016.
 */
public abstract class Apartment {

    private int apartmentNumber;

    public Apartment(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " number " + apartmentNumber + "\n";
    }

    public int getNumber() {
        return apartmentNumber;
    }


}
