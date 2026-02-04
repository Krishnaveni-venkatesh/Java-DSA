/*
input={90,13,785,345}
output=[13, 90, 345, 785]
 */

package Problems;

import java.util.Arrays;

public class SelectionSort {
    public static int[] select(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int min =i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
       return arr;

    }
    public static void main(String[] args){
        int[] arr={90,13,785,345};
        int n=4;
        System.out.println(Arrays.toString(select(arr,n)));
    }
}
