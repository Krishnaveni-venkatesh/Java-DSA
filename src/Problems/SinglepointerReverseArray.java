package Problems;

import java.util.Arrays;

public class SinglepointerReverseArray {
    public static int[] reverse(int[] arr,int i){
        if(i>=arr.length/2){
            return arr;
        }
        else{
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
       return reverse(arr,i+1);
    }
    public static void main(String[] args){
        int [] arr={6,9,3,90,45};
        System.out.println(Arrays.toString(reverse(arr,0)));
    }
}
