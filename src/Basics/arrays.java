package Basics;


import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int[] arr=new int[5];//1d array
        System.out.println(arr.length);
        arr[0]=21;
        arr[1]=50;
        arr[2]=34;
        arr[3]=44;
        arr[4]=42;
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }

}
