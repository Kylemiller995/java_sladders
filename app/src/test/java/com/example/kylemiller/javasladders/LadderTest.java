package com.example.kylemiller.javasladders;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 13/09/2017.
 */
public class LadderTest {
    Ladder ladder;
    Player player;

    @Before
    public void before() {
        player = new Player("Classic Harrison", 20);
        ladder = new Ladder();
    }

    @Test
    public void editPosition() {
        ladder.editPosition(player);
        assertEquals(27, player.getPosition());
    }

}

