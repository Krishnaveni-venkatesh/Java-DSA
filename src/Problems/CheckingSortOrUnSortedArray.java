package Problems;

public class CheckingSortOrUnSortedArray {
    public static boolean checkArray(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false ;
            }

        }
        return true;
    }
    public static void main(String[] args){
        int[] arr={1,3,5,69,10};
        System.out.println(checkArray(arr));
    }
}
