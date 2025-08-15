package Problems;
import java.util.ArrayList;
//input={5, 7, 7, 8, 8, 10};,target=8  returning index of first and last position of target element in sorted array
//output =[3,4]

public class Findfirstandlast {
    public static ArrayList<Integer> searchRange(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        result.add(first);
        result.add(last);

        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;
    }

    private static int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7,7,7, 8, 8, 10};
        int target = 8;

        ArrayList<Integer> result = searchRange(nums, target);

        System.out.println( result);
    }
}


