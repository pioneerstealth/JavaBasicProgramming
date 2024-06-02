package com.ilpbatch4.utility;

public class SumofCubesAlternating {

	public static void main(String[] args) {
		int input=4;
		System.out.print(calculateSeriesSum(input));

	}
	  public static long calculateSeriesSum(int input) {
	        boolean flag = true;
	        int count = 1;
	        long sum = 0;
	        for (int i = 1; count <= input; i+=2) {
	            if (flag) {
	                sum += Math.pow(i, count);
	                flag = false; 
	                count++; 
	            } else {
	                sum -= Math.pow(i, count);
	                flag = true; 
	                count++; 
	            }
	        }
			return sum;
	  }

	
	

}
