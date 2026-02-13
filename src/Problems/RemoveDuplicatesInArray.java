package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static int remo(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }

        }
        return i+1;

    }
    public static void main(String[] args){
        int[] arr={1,1,2,3,5,8,8};
        int newLength=remo(arr);
        for(int k=0;k<newLength;k++){
            System.out.print(arr[k]+" ");
        }

        }
    }

