package Problems;

import java.util.Arrays;

public class BubbleSort {
    public int[] selSort(int[] arr,int n){
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
      return arr;
    }
    public static void main(String[] args){
        int[] arr ={45,7,9,30,57,890};
        int n=arr.length;
        BubbleSort obj1=new BubbleSort();
        System.out.println(Arrays.toString(obj1.selSort(arr,n)));

    }
}
