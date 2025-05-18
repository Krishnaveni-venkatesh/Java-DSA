//input=[3,4,7,8,9,10]
//output=[9,16.49,64,81,100] #finding the squares of each array element

package Problems;

import java.util.Arrays;

public class SquaresOfArray {
    public static void squaresOfSortedArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);

    }
    public static void main(String[]args){
        int [] arr={3,4,7,8,9,10};
        squaresOfSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
