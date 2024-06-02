package com.ilpbatch4.utility;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAnArray {
	public static void main(String[] args) {
		int input [] ={1,2,2,3,4,4,5,5,5,7,8,9};
		FindDuplicates(input);


	}
	private static void FindDuplicates(int arr[]){
		Set<Integer> seenNumbers = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for(int number : arr){
			if(!seenNumbers.add(number)){
				duplicates.add(number);
			}
		}
		System.out.println("Duplicates are :");
		for(int numbers:duplicates){
			System.out.print(numbers+" ");
		}

	}
}
