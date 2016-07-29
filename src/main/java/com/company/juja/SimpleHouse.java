package com.company.juja;

/**
 * Created by vov4i on 7/24/2016.
 */
public class SimpleHouse {

    private int floorsInTheHouse;
    private int apartmentsOnFloor;

    public SimpleHouse(int floorsCount, int apartmentsOnFloor){
        this.floorsInTheHouse = floorsCount;
        this.apartmentsOnFloor = apartmentsOnFloor;
    }


    @Override
    public String toString() {
        String result = "House:\n";
        for (int i = 0; i < floorsInTheHouse; i++) {
            for (int j = 0; j < apartmentsOnFloor; j++) {
                result += "#";
            }
            result += "\n";
        }
        return result;
    }
}
