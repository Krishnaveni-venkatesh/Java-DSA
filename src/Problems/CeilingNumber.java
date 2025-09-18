package Problems;

public class CeilingNumber {
    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return arr[start];
    }
    public static void main(String[]args){
        int[] arr={2,3,5,14,16,18};
        int target =15;
        System.out.println(ceilingNumber(arr,target));
    }
}
