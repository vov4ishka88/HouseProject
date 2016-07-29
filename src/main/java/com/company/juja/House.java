package com.company.juja;

import com.company.juja.apartment.LivingApartment;
import com.company.juja.staff.Cleaner;


/**
 * Created by vov4i on 7/19/2016.
 */
public class House {

    private Floor[] floors;
    private Cleaner[] cleaners; // What if we move it to the class_Floor

    public House(int floorsCount, int apartmentsOnFloor){
        NumberGenerator numbers = new NumberGenerator();

        floors = new Floor[floorsCount];
        cleaners = new Cleaner[floorsCount];

        for (int index = 0; index < floorsCount; index++){
            floors[index] = new Floor(index + 1, apartmentsOnFloor, numbers);
            //floors[index].setCleaner(cleaners[index]);
        }
    }

    public void settle(Owner owner) {
        System.out.println("Try to settle " + owner.toString() + "\n");
        for (Floor floor : floors){
            LivingApartment apartment = (LivingApartment) floor.getFreeApartment();
            if(apartment != null){
                apartment.addOwner(owner);
                break;
            }
        }
    }

    public void addCleaner(Cleaner cleaner) {
        int floor = nextCleanerPlace();
        this.cleaners[floor] = cleaner;
        this.floors[floor].setCleaner(cleaner);
    }

    private int nextCleanerPlace() {
        for (int index = 0; index < cleaners.length; index++) {
            if (cleaners[index] == null) return index;
        }
        throw new RuntimeException("No place for new cleaner");
    }

    @Override
    public String toString() {
        String result = "*****************************************\n";
        result += "*****************************************\n";
        result += "House:\n";
        for (Floor floor : floors) {
           result += floor.toString() + "\n";
        }
        return result;
    }
}
