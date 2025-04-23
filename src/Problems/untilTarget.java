package Problems;
//printUntilTarget(int[] arr,int target)
//int[] nums = {10, 20, 30, 40, 50};
//target = 40

public class untilTarget {
    public static void printUntiltarget(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if (arr[i] == target) {
                break;
            }
            else{
                System.out.println(arr[i]);
            }


        }

    }
    public static void main(String[] args){
        int [] arr={10,20,30,40,50};
        printUntiltarget(arr,40);
    }
}
