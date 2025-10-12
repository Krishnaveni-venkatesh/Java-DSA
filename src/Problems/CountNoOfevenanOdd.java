package Problems;

import java.util.Arrays;

public class CountNoOfevenanOdd {
    public static int[] CountEandO(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 4, 9, 3};
        int[] result = CountEandO(arr);
        System.out.println(Arrays.toString(result));
    }
}
    /*public static int[] reverseArray(int[] arr){
        int[] result=  new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            result[j]=arr[i];
            j++;



        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}*/
