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

    @Test
    public void checkBoard2() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{2,1,3, 6,7,8, 4,5,9},
                {4,6,7, 1,5,9, 3,2,8},
                {5,8,9, 2,3,4, 6,1,7},
                {1,2,4, 3,8,6, 7,9,5},
                {8,3,5, 7,9,2, 1,4,6},
                {7,9,6, 5,4,1, 8,3,2},
                {3,5,1, 9,6,7, 2,8,4},
                {9,7,8, 4,2,3, 5,6,1},
                {6,4,2, 8,1,5, 9,7,3}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertTrue(CheckBoard.checkBoard(boardAsStrings));
    }

    @Test
    public void checkForFalsePositivesAgainBecausePhilip() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{1,1,3, 6,7,8, 4,5,9},
                {4,6,7, 1,5,9, 3,2,8},
                {5,8,9, 2,3,4, 6,1,7},
                {1,2,4, 3,8,6, 7,9,5},
                {8,3,5, 7,9,2, 1,4,6},
                {7,9,6, 5,4,1, 8,3,2},
                {3,5,1, 9,6,7, 2,8,4},
                {9,7,8, 4,2,3, 5,6,1},
                {6,4,2, 8,1,5, 9,7,3}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertFalse(CheckBoard.checkBoard(boardAsStrings));
    }

    @Test
    public void checkBoard3() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{3,4,5, 1,2,7, 6,8,9},
            {1,2,6, 3,8,9, 4,5,7},
            {7,8,9, 5,4,6, 1,2,3},
            {2,1,8, 6,7,4, 3,9,5},
            {5,7,4, 9,1,3, 2,6,8},
            {6,9,3, 2,5,8, 7,1,4},
            {8,3,1, 7,6,5, 9,4,2},
            {9,5,2, 4,3,1, 8,7,6},
            {4,6,7, 8,9,2, 5,3,1}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertTrue(CheckBoard.checkBoard(boardAsStrings));
    }

    @Test
    public void checkBoard4() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{3,1,4, 6,5,2, 7,8,9},
                {6,2,5, 7,8,9, 3,1,4},
                {8,7,9, 1,3,4, 5,2,6},
                {2,3,1, 4,7,5, 6,9,8},
                {4,5,6, 2,9,8, 1,3,7},
                {9,8,7, 3,1,6, 2,4,5},
                {5,4,2, 8,6,1, 9,7,3},
                {1,6,3, 9,4,7, 8,5,2},
                {7,9,8, 5,2,3, 4,6,1}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertTrue(CheckBoard.checkBoard(boardAsStrings));
    }

    @Test
    public void checkBoard5() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{1,2,3, 4,5,6, 8,7,9},
                {5,7,4, 2,9,8, 1,3,6},
                {6,8,9, 7,1,3, 2,4,5},
                {4,1,8, 3,2,9, 5,6,7},
                {2,3,6, 5,4,7, 9,8,1},
                {7,9,5, 8,6,1, 4,2,3},
                {9,4,7, 6,8,5, 3,1,2},
                {8,6,1, 9,3,2, 7,5,4},
                {3,5,2, 1,7,4, 6,9,8}};
        String[][] boardAsStrings = CheckBoard.convertIntArrayToStringArray(boardAsInts);
        assertTrue(CheckBoard.checkBoard(boardAsStrings));
    }
}
