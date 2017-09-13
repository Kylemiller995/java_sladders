package com.example.kylemiller.javasladders;

import java.util.HashMap;

/**
 * Created by kylemiller on 13/09/2017.
 */
import java.util.*;

public class GameBoard {
    HashMap<Integer, Modifier> modifiers;
    int boardSize;
    Snake snake;
    Ladder ladder;


    public GameBoard(HashMap<Integer, Modifier> modifiers, int boardSize) {
        this.modifiers = modifiers;
        this.boardSize = boardSize;
    }

    public HashMap<Integer, Modifier> getModifiers() {
        return modifiers;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void populateModifiers(){
        Random rand = new Random();
        Random randomModifier = new Random();
        Modifier[] modArray = new Modifier[] {new Snake (), new Ladder() };

        for(int i = 0; i <= boardSize/10 ; i++){
            int randomNumber = randomModifier.nextInt(2);

            modifiers.put(rand.nextInt(boardSize - 6) + 6 , modArray[randomNumber] );
        }



//        modifiers.put(new Integer(random num(start from 6 to board size), loop for modifier or random); rubys .times
//        modifiers.put(randomnumber, snake or ladder);
//        modifiers.put(new Integer(8), ladder);
//        modifiers.put(new Integer(8), ladder);

    }
}
