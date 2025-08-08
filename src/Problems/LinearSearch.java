package Problems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 3, 56, 78, 90};
        int target = 67;
        int result=linearSearch(arr,target);
        System.out.println(result);
    }
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}