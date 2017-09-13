package com.example.kylemiller.javasladders;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 13/09/2017.
 */
public class GameBoardTest {
    GameBoard gameBoard;
    HashMap<Integer, Modifier> modifiers;
    Snake snake;

    @Before
    public void before(){
        modifiers = new HashMap<>();
        gameBoard = new GameBoard(modifiers, 100);
        snake = new Snake();
        gameBoard.modifiers.put(0, snake);
    }


    @Test
    public void getModifiers()  {
        HashMap<Integer, Modifier> modifiers = gameBoard.getModifiers();
        assertEquals(1, modifiers.size());
        assertEquals(snake, modifiers.get(0));

    }
    @Test
    public void getBoardSize() {
        assertEquals(100, gameBoard.getBoardSize());
    }

    public void roll() {
        Dice fakeDice = Mockito.mock(Dice.class);
        Mockito.when(fakeDice.roll())
                .thenReturn(4);

        assertEquals(4, fakeDice.roll() );
    }

}



