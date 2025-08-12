package Problems;

public class BinarySearch {
    //return the index
    //return -1 if it does  not exist
    static int binarySearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
           // int mid=(start+end)/2; //mid value exceeds the range of int in java
            int mid=start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start =mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[]arr={-23,-22,-3,0,23,34,45,56,67,89,90};
        int target=67;
        System.out.println(binarySearch(arr,target));
    }

}
