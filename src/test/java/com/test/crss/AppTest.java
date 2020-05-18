package com.test.crss;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest {

    @Test
    public void checkBoardWithOnlyRowsCorrect() {
        CheckBoard checkBoard = new CheckBoard();
        String[][] incorrectBoard = {{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"}};
        assertFalse(checkBoard.checkBoard(incorrectBoard));
    }

    @Test
    public void checkCorrectBoard() {
        CheckBoard checkBoard = new CheckBoard();
        String[][] correctBoard = {{"8", "3", "5", "4", "1", "6", "9", "2", "7"},
                {"2", "9", "6", "8", "5", "7", "4", "3", "1"},
                {"4", "1", "7", "2", "9", "3", "6", "5", "8"},
                {"5", "6", "9", "1", "3", "4", "7", "8", "2"},
                {"1", "2", "3", "6", "7", "8", "5", "4", "9"},
                {"7", "4", "8", "5", "2", "9", "1", "6", "3"},
                {"6", "5", "2", "7", "8", "1", "3", "9", "4"},
                {"9", "8", "1", "3", "4", "5", "2", "7", "6"},
                {"3", "7", "4", "9", "6", "2", "8", "1", "5"}};
        assertTrue(checkBoard.checkBoard(correctBoard));
    }

    @Test
    public void checkBoardWithRowsAndColumnsCorrectButNotSquares() {
        CheckBoard checkBoard = new CheckBoard();
        String[][] incorrectBoard =
                {{"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"9", "1", "2", "3", "4", "5", "6", "7", "8"},
                {"8", "9", "1", "2", "3", "4", "5", "6", "7"},
                {"7", "8", "9", "1", "2", "3", "4", "5", "6"},
                {"6", "7", "8", "9", "1", "2", "3", "4", "5"},
                {"5", "6", "7", "8", "9", "1", "2", "3", "4"},
                {"4", "5", "6", "7", "8", "9", "1", "2", "3"},
                {"3", "4", "5", "6", "7", "8", "9", "1", "2"},
                {"2", "3", "4", "5", "6", "7", "8", "9", "1"}};
        assertFalse(checkBoard.checkBoard(incorrectBoard));
    }

}