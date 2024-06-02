package com.ilpbatch4.utility;

public class DescendingFourNumbers {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 8, d = 1;
         sortFourNumbers(a, b, c, d);
    }

    public static void sortFourNumbers(int a, int b, int c, int d) {
        if (a > b) {
            a = a + b; 
            b = a - b; 
            a = a - b; 
        }
        if(a > c) {
        	a= a + c;
        	c = a - c;
        	a = a - c;
        }
        if(a > d) {
        	a = a +d;
        	d= a-d;
        	a = a- d;
        }
        if(b > c) {
        	b = b+ c;
        	c = b-c;
        	b = b-d;
        }
        if(b > d) {
        	b = b +d;
        	d= b- d;
        	b = b-d;
        }
        if(c>d) {
        	c = c+d;
        	d = c-d;
        	c = c-d;
        	
        }
        System.out.println("Sorting "+a+','+b+','+c+','+d);
        

    }
}
