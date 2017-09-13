package com.example.kylemiller.javasladders;

/**
 * Created by kylemiller on 13/09/2017.
 */

public class Snake implements Modifier {


    public void editPosition(Player player) {
        int currentPosition = player.getPosition();
        int newPosition = currentPosition - 6;
        player.setPosition(newPosition);
    }


}
