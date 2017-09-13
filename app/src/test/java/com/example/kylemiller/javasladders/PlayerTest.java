package com.example.kylemiller.javasladders;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 13/09/2017.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Classic Harrison", 0);
    }


    @Test
    public void getName() {
        assertEquals("Classic Harrison", player.getName());
    }

    @Test
    public void getPosition() {
        assertEquals(0, player.getPosition());

    }

}