package Problems;

public class OrderAgnosticsBS {
    static int orderAgnosricsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end) {
            // int mid=(start+end)/2; //mid value exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {

                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,67,78,89,90};
        int target=89;
        System.out.println(orderAgnosricsBS(arr,target));
    }
}







