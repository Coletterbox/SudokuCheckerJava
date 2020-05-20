package com.test.crss;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;


public class ConvertArrayTest {

    @Test
    public void checkArrayIsConverted() {
        CheckBoard checkBoard = new CheckBoard();
        int[][] boardAsInts = {{1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        String[][] boardAsStrings = {{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"}};
        assertArrayEquals(checkBoard.convertIntArrayToStringArray(boardAsInts), boardAsStrings);
    }
}