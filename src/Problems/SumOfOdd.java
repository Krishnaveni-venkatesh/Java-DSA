package Problems;

public class SumOfOdd {

    public static int sumOfOdd(int[] arr){

        int sum = 0;

        int index = 0;
        int size = arr.length;
        while(index<size){
            if(arr[index] %2 != 0){
                sum = sum + arr[index];
            }
            index++;
        }
        return sum;
    }

    public static void main(String arg[]){
        int[] nums = {1,2,3,4,5};
       int result = sumOfOdd(nums);
        System.out.println("the sum of odd is "+sumOfOdd(nums));
    }
}
