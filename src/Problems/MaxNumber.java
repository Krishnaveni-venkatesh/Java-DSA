package Problems;
import java.util.Arrays;



/*
nums = [1,2,5,7,9,45,54,32,44]
 */
public class MaxNumber {



    public int getMaxNum(int[] nums) {

        int maxNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int nextNum = nums[i];
            if (nextNum > maxNum) {
                maxNum = nums[i];
            }

        }
        return maxNum;

    }
    public int method2(int[] numbers){

        Arrays.sort(numbers);
        int max=numbers[numbers.length-1];//index accessing




    return max;
    }

    public static void main(String[] args ){

        int num = 5;

        int[] arr = {1,2,5,7,9,45,54,32,44};
        MaxNumber obj = new MaxNumber();
        System.out.println(obj.getMaxNum(arr));
        System.out.println(obj.method2(arr));

        int[] a= {4,3,2,5,6,7};
        System.out.println("array before sorting "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("array after sorting "+Arrays.toString(a));
    }
}

