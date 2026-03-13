package Problems;

public class LinearSearch {

    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 3, 56, 78, 90};
        int target = 67;
        int result=linearSearch(arr,target);
        System.out.println(result);
    }

}