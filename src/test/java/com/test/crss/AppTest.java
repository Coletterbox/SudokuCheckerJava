package com.test.crss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest {
    @Test
    public void shouldAnswerWithFalse()
    {
        CheckBoard checkBoard = new CheckBoard();
        String[][] board = {{"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9"}};
        assertFalse(checkBoard.checkBoard(board));
    }
}