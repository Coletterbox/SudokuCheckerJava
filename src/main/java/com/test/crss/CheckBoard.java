package com.test.crss;

import java.sql.Array;
import java.util.Arrays;

public class CheckBoard {
    public static void main(String[] args) {

    }

    public static boolean checkBoard(String[][] board) {

        // checks each array (i.e. each row) is 1-9
        for (int i = 0; i < board.length; i++) {

            String[] arrayCopy = board[i].clone();
            String lineAsString = String.join("", arrayCopy);
            char[] charArray = lineAsString.toCharArray();
            Arrays.sort(charArray);
            String charArrayToString = new String(charArray);

            String sortedNumbers = "123456789";
            if (charArrayToString.compareTo(sortedNumbers) != 0) {
                return false;
            }
        }

        // rewrites board into arrays representing columns; checks columns
        String[] columns = new String[81];
        int columnsArrayIndex = 0;
        for (int j = 0; j < board.length; j++) {
            for (int k = 0; k < board[j].length; k++) {
                columns[columnsArrayIndex] = board[k][j];
                columnsArrayIndex++;
            }
        }
        //System.out.println(Arrays.toString(columns));
        for (int l = 0; l < 9; l++) {
            int number = l*9;
            String[] column = Arrays.copyOfRange(columns, number, number + 9);
            String joinedColumn = String.join("", column);
            System.out.println(joinedColumn);

            String sortedNumbers = "123456789";
            if (joinedColumn.compareTo(sortedNumbers) != 0) {
                return false;
            }
        }

        return true;
    }
}
