package com.ilpbatch4.utility;

public class PatternZ {
    public static void main(String[] args) {
        int input = 4;
        displayPatternZ(input);
    }

    private static void displayPatternZ(int input) {
        for (int i = 1; i <= input; i++) {
            if (i == 1 || i == input) {
                for (int j = 1; j <= input; j++) {
                    System.out.print("*");
                }
            } 
            else {
                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
