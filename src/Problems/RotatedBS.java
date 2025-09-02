/*[3,2,3,1,2,4,5,5,6]
[1,2,2,3,3,4,5,5,6]

[1,2,3,4,5,6]

p=3

pth largest=4

pth smallest=3
*/



package Problems;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RotatedBS {

    public static int sumOfP(int[] arr, int p) {
        ArrayList<Integer> nonduplicates = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] != arr[i + 1]) {
                nonduplicates.add(arr[i]);


            }
        }
             nonduplicates.add(arr[arr.length-1]);
            int smallestnum = arr[p - 1];
            int largestnum = arr[arr.length -p];
            System.out.println(nonduplicates);




        return smallestnum+largestnum;
    }

    public static void main(String[] args) {
        int [] arr={3,2,3,1,2,4,5,5,6};
        int p=3;
       System.out.println( sumOfP(arr,p));



    }
}
