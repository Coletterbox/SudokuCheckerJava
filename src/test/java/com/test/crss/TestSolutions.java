package com.test.crss;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestSolutions {
    @Test
    public void checkForFalsePositives() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{1,0,7, 0,0,3, 0,8,0},
                {0,5,6, 0,9,0, 0,0,7},
                {3,8,9, 0,7,0, 2,0,5},
                {0,0,2, 3,6,7, 5,9,0},
                {0,7,0, 9,8,2, 4,0,6},
                {9,0,8, 0,0,1, 7,2,3},
                {6,0,4, 7,1,0, 0,0,2},
                {7,2,5, 4,3,9, 8,6,1},
                {0,0,0, 6,0,0, 3,7,4}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertFalse(CheckBoard.checkBoard(boardAsStrings));
    }

    @Test
    public void checkBoard() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{1,4,7, 2,5,3, 6,8,9},
            {2,5,6, 8,9,4, 1,3,7},
            {3,8,9, 1,7,6, 2,4,5},
            {4,1,2, 3,6,7, 5,9,8},
            {5,7,3, 9,8,2, 4,1,6},
            {9,6,8, 5,4,1, 7,2,3},
            {6,3,4, 7,1,8, 9,5,2},
            {7,2,5, 4,3,9, 8,6,1},
            {8,9,1, 6,2,5, 3,7,4}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertTrue(CheckBoard.checkBoard(boardAsStrings));
    }
}
