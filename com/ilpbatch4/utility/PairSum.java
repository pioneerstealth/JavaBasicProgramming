package com.ilpbatch4.utility;
import java.util.HashSet;
import java.util.Set;

public class PairSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        countPairSum(arr,6);
        
    }
    private static void countPairSum(int arr[], int K){
        Set<Integer> seenNumbers = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (seenNumbers.contains(K - num)) {
                count++;
            } 
            else {
                seenNumbers.add(num);
            }
        }
        System.out.println(count);
    }
    
}
