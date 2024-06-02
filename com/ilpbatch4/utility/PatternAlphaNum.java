package com.ilpbatch4.utility;
class  PatternAlphaNum{
    public static void main(String[] args) {
        int input=4;
        printPattern(input);
        
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }
 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
 
            System.out.println();
        }
    }


}