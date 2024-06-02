package com.ilpbatch4.utility;

public class MissingNumber {
	public static void main(String[] args) {
		int limit =10;
		int limitOfNumbers[]= {1,2,3,6,8,9};
		findMissingNumbers(limitOfNumbers,limit);
		
	}

	private static void findMissingNumbers(int[] limitOfNumbers, int limit) {
		  		for(int i=1;i<=limit;i++) {
		  			boolean found=false;
		  			for(int j:limitOfNumbers) {
		  				if(i==j) {
		  					found=true;
		  				}
		  			}
		  			if(!found)
		  				System.out.println(i);
		  		}
			   
			   
			   
			   
		   
	}

}
