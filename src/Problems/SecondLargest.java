package Problems;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        //int[] arr = {20, 34, 57, 89, 56};
        //int largest = Integer.MIN_VALUE;
        //int Secondlargest = Integer.MIN_VALUE;
        //for (int num : arr) {
            //if (num > largest) {
                //Secondlargest = largest;
                /*largest = num;

            } else if (num > Secondlargest && num != largest) {
                Secondlargest = num;

            }
        }
        System.out.println(Secondlargest);
        /* alternative approach*/

        int[] arr1 = {20, 34, 57, 89, 56};
        Arrays.sort(arr1);
        int secondLargest = arr1[arr1.length - 2];
        System.out.println(secondLargest);
    }
}











