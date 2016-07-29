package com.company.juja.apartment;

import com.company.juja.Owner;

/**
 * Created by vov4i on 7/19/2016.
 */
public class LivingApartment extends Apartment {

    //private int apartmentNumber; --> FIELD IS MOVED TO THE PARENT CLASS
    private Owner[] owners;

    public LivingApartment(int apartmentNumber, int capacity) {
        super(apartmentNumber);
        this.owners = new Owner[capacity];
    }

    public void addOwner(Owner owner) {
        owners[getFreeRoomIndex()] = owner;
    }

    @Override
    public boolean isFree() {
        return owners[owners.length-1] == null;
    }

    private int getFreeRoomIndex() {
        for (int index = 0; index < owners.length; index++){
            if (owners[index] == null) {
                return index;
            }

        }
        throw new RuntimeException("No free rooms for Owner");
    }

    public boolean isSettled() {
        return owners[0] != null;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";
        for (int index = 0; index < owners.length; index++){
            Owner owner = owners[index];
            if(owners[index] != null){
                result += "**************\n";
                result += "Owner: " + owner.toString() + "\n";
                result += "**************\n";
            }
        }
        return result;
    }
}
