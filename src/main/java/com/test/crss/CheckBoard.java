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
            char[] charArray = lineAsString.toCharArray();
            Arrays.sort(charArray);
            System.out.println(charArray);
            //String charArrayToString = Arrays.toString(charArray);
            //System.out.println(charArrayToString);
//            String sortedLineAsString = charArrayToString.join("");
//
//            System.out.println(sortedLineAsString);

//            String sortedLineAsString = Arrays.toString(charArrayToString).substring(1, 3*charArrayToString.length()-1).replaceAll(", ", "");
            String sortedLineAsString = "";
            String charArrayToString = new String(charArray);
            System.out.println(charArrayToString);
            String sortedNumbers = "123456789";
            if (charArrayToString.compareTo(sortedNumbers) != 0) {
                return false;
            }
        }

        return true;
    }
}
