package com.test.crss;

import java.util.Arrays;

public class CheckBoard {
    public static void main(String[] args) {

    }

    public static boolean checkBoard(String[][] board) {

        // checks each array is 1-9
        for (int i = 0; i < board.length; i++) {

            String[] arrayCopy = board[i].clone();
            String lineAsString = String.join("", arrayCopy);
            char charArray[] = lineAsString.toCharArray();
            Arrays.sort(charArray);
            String sortedLineAsString = charArray.toString();

            if (sortedLineAsString != "123456789") {
                return false;
            }
        }
    }
}
