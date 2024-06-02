package com.ilpbatch4.utility;

public class SumofSeriesofCubes {
	public static void main(String[] args) {
		int input=3;
		System.out.println(seriesSum(input));
		
	}

	private static int seriesSum(int input) {
		int first=1;
		int second=8;
		int sum=0;
		if(input==1) {
			return 1;
		}
		if(input==2) {
			return second;
		}
		for(int i=3;i<=input;i++) {
			sum=first+second;
			sum=sum+cube(i);
			first=second;
			second=cube(i);
			
		}
		return sum;
		
	}
	private static int cube(int value) {
		return value*value*value;
	}
	

}
