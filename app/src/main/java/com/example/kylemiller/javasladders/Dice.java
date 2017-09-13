package com.example.kylemiller.javasladders;

import java.util.Random;

/**
 * Created by kylemiller on 13/09/2017.
 */

public class Dice implements Rollable {
    int numberOfSides;

    public Dice(int numberofSides){
        this.numberOfSides = numberOfSides;
    }

    private int randomNumber(int min, int max){
        Random rand = new Random();
        int result = rand.nextInt((max-min) + 1) + min;
        return result;
    }


    public int roll(){
        return randomNumber(1, this.numberOfSides);
    }
}
