//input=[1,2,3,4,5,6,7]
//output=[5,6,7,1,2,3,4]
//k=3  #rotating 3 times
package Problems;

import java.util.Arrays;

public class RotateArray {
    public static void rotateLeft(int[]nums,int k){
        int n= nums.length;
        reverse(nums,0, nums.length-1); //first reversing the entire array
        reverse(nums,0,k-1); //reversing only[7,6,5]
        reverse(nums,k,n-1);   //reversing [4,3,2,1]


    }
    public static void reverse(int[] arr,int i,int j){
        while(i < j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;

        }
    }
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
        rotateLeft(arr,k);
        System.out.println(Arrays.toString(arr));


    }
}
