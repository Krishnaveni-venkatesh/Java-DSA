package Problems;

import java.util.Arrays;

public class InsertionSort {

        int [] insertionSort (int arr[],int n){
            for(int i=1;i<n;i++){
                int j=i;
                while(j>0 && arr[j-1]>arr[j] ){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
            return arr;
        }
        public static void main(String[] args){
            int [] arr={4,5,7,2,9,2,1};
            int n=7;
            InsertionSort obj1=new InsertionSort();
            obj1.insertionSort(arr,n);
            for(int i:arr){
                System.out.print(i+" ");

            }
        }
    }




