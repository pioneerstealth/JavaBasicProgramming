package com.ilpbatch4.utility;

public class SumOfSeriesOddSub {
	public static void main(String[] args) {
		int input=3;
		sumOfSeries(input);
	}

	private static void sumOfSeries(int input) {
		int sum=0;
		boolean flag=true;
		for(int i=1; i<=input;i+=2) {
			if(flag) {
				sum+=i;	
				flag=false;
			}
			else {
				sum-=i;
				flag=true;
			}
			
		}
		System.out.println("The sum of the series:"+sum);
	}


}
