package Problems;

public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 56, 89, 78};
        System.out.println(secondLargest(arr));
    }
}

