package com.example.kylemiller.javasladders;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 13/09/2017.
 */
public class SnakeTest {

    Snake snake;
    Player player;

    @Before
    public void before() {
        player = new Player("Classic Harrison", 20);
        snake = new Snake();
    }

    @Test
    public void editPosition() {
        snake.editPosition(player);
        assertEquals(14, player.getPosition());
    }

}