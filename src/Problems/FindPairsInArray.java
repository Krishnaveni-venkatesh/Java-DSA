package Problems;


import java.util.ArrayList;

public class FindPairsInArray {
    public static void main(String[] args){
        int[] arr={1,2,4,4,5,6,7};
        int sum=8;
        System.out.println(findPairs(arr,sum));

    }
    public static ArrayList<ArrayList<Integer>> findPairs(int[] arr, int sum){
        int low = 0;
        int high =arr.length-1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while(low < high) {

            if (arr[low] + arr[high] < sum) {
                low++;
            } else if (arr[low] + arr[high] > sum) {
                high--;
            } else if (arr[low] + arr[high] == sum) {
                ArrayList<Integer> subArray = new ArrayList<>();
                subArray.add(arr[low]);
                subArray.add(arr[high]);
                low++;
                high--;
                result.add(subArray);
            }

        }

        return result;
    }

}
