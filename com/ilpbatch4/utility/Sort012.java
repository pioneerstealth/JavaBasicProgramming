package com.ilpbatch4.utility;

public class Sort012 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,1,0,2};
        SortZeroOneTwo(arr);
    }
    private static void SortZeroOneTwo(int arr[]){
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int num : arr){
            switch (num) {
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
                    break;
                case 2:
                    countTwo++;
                    break;
                default:
                    break;
            }
        }
        int index =0;
        for(int i=0;i<countZero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=countZero;i<countOne+countTwo;i++){
            arr[index]=1;
            index++;
        }
        for(int i=countZero+countOne;i<countTwo+countZero+countOne;i++){
            arr[i]=2;
            index++;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
        
        
    }
    
}
