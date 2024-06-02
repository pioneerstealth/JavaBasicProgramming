package com.ilpbatch4.utility;

public class DivideFactorial {

	public static void main(String[] args) {
		int input=3;
		
		System.out.println(sumofFactoial(input));
	}
	private static float sumofFactoial(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += i / (double)factorialOfNumber(i);
		}
		return sum;
	}
	private static int factorialOfNumber(int input) {
		int Factorial = 1;
		for (int i = 1; i <= input; i++) {
			Factorial *= i;
		}
		return Factorial;
	}

}
