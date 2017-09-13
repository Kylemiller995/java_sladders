package com.example.kylemiller.javasladders;

/**
 * Created by kylemiller on 13/09/2017.
 */

public class Player {
    String name;
    int position;

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
