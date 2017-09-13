package com.example.kylemiller.javasladders;

import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 13/09/2017.
 */



public class DiceTest {

    @Test
    public void roll() {
        Dice fakeDice = Mockito.mock(Dice.class);
        Mockito.when(fakeDice.roll())
        .thenReturn(4);

        assertEquals(4, fakeDice.roll() );
    }

}