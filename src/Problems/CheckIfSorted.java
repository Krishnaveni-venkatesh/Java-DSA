package Problems;
public class CheckIfSorted {
    public static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }


            }
        return true;
        }

    public static void main(String[] args){
        int[] arr={6,3,4,5,7,8,9};
        System.out.println(sorted(arr));
    }
}
