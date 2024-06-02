package com.ilpbatch4.utility;

public class LargestSubarryOfSumN {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int K=10;
        SubarrayofSum(arr, K);
    }
    private static void SubarrayofSum(int arr[],int S){
        int left = 0, sum = 0;
        for (int right = left; right < arr.length; right++) {
            sum += arr[right];
            while (sum > S && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == S) {
               System.out.println("["+left+" "+right+"]");
            }
        }
    }

    
    
}
