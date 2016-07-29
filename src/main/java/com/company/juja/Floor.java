package com.company.juja;

import com.company.juja.apartment.Apartment;
import com.company.juja.apartment.LivingApartment;
import com.company.juja.apartment.TechnicalApartment;
import com.company.juja.staff.Cleaner;

/**
 * Created by vov4i on 7/19/2016.
 */
public class Floor {

    private int floorNumber;
    private Apartment[] apartments;
    private static final int DEFAULT_APARTMENT_CAPACITY = 2;
    private Cleaner cleaner;


    public Floor(int floorNumber, int apartmentsOnFloor, NumberGenerator numbers) {
        this.floorNumber = floorNumber;
        this.apartments = new Apartment[apartmentsOnFloor];
        this.apartments[0] = new TechnicalApartment(numbers.getNext());
        for (int index = 1; index < apartmentsOnFloor; index++){
            apartments[index] = new LivingApartment(numbers.getNext(),
                    DEFAULT_APARTMENT_CAPACITY);
        }
    }

    public Apartment getFreeApartment() {
        for (Apartment apartment : apartments) {
            if (apartment instanceof LivingApartment && apartment.isFree()){
                LivingApartment livingApartment = (LivingApartment) apartment;
                if(!livingApartment.isSettled()) {
                    cleaner.clean(livingApartment);
                }
                return livingApartment;
            }
        }
        return null; //TODO implement me
    }

    @Override
    public String toString() {
        String result = "================================\n";
        result += "Floor number " + floorNumber + "\n";
        result += "--------------------------------\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "================================\n";
        return result;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }
}
