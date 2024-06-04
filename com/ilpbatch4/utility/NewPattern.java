import java.util.*;
public class NewPattern
{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int input;
        System.out.println("Enter no of rows");
        input=sc.nextInt();
        rightangle(input);
    }
    public static void rightangle(int input){
        for(int i =0;i<=input;i++){
            for (int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}