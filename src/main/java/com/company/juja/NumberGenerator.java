package com.company.juja;

/**
 * Created by vov4i on 7/20/2016.
 */
public class NumberGenerator {

    private int current;

    public NumberGenerator() {
        this.current = 1;
    }

    public int getNext(){
        int result = current;
        current++;
        return result;
    }

}
