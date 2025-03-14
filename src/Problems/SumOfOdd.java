package Problems;

import java.util.Scanner;

public class SumOfOdd {

    public static int sumOfOdd(int[] arr){

        int sum = 0;

        int index = 0;
        int size = arr.length;
        while(index<size){
            if(arr[index] %2 != 0){
                sum = sum + arr[index];
            }
            index++;
        }
        return sum;
    }

    public static void main(String arg[]){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of the arr");
       int size = input.nextInt();
       int[] arr = new int[size];
       for(int i = 0;i<size;i++){
           arr[i] = input.nextInt();
       }
        System.out.println("the sum of odd is "+sumOfOdd(arr));
    }
}
