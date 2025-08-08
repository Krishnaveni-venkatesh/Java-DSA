package Basics;
import java.util.Scanner;
import java.util.Arrays;

public class Inputforloop {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        //int[] arr=new int[5];


       // for(int i=0;i<arr.length;i++){
            //arr[i]=in.nextInt();

       // }
       // for(int i=0;i<arr.length;i++){
          //  System.out.print(arr[i] + " ");
        //}
       // for(int num:arr){
        //    System.out.print(num + " ");


       // }
        //array of objects

    String[] str=new String[4];
    for(int i=0;i<str.length;i++){
        str[i]=in.next();
    }
    System.out.println(Arrays.toString(str));
    str[0]="krish";
        System.out.println(Arrays.toString(str));
    }
}
