package com.company.juja;

/**
 * Created by vov4i on 7/19/2016.
 */
public class Owner {


    protected final String name;

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner " + name;
    }
}
