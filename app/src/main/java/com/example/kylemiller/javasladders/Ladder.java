package com.example.kylemiller.javasladders;

/**
 * Created by kylemiller on 13/09/2017.
 */

public class Ladder implements Modifier {

    public void editPosition(Player player) {
        int currentPosition = player.getPosition();
        int newPosition = currentPosition + 7;
        player.setPosition(newPosition);
    }
}
