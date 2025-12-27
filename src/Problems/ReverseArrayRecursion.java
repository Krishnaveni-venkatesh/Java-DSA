package Problems;

import java.util.Arrays;

public class ReverseArrayRecursion {
    public static int[]reverse(int[] arr,int left,int right){
        if(left>=right){
            return arr;

        }else{
            int temp=arr[left];
           arr[left]=arr[right];
            arr[right]=temp;
        }
      return reverse(arr,left+1,right-1);
    }
    public static void main(String[] args){
        int[] arr={2,4,6,89,80};
        System.out.println(Arrays.toString(reverse(arr,0,arr.length-1)));
    }
}
