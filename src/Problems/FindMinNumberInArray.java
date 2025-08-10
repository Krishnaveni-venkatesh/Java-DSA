package Problems;

public class FindMinNumberInArray {
    public static void main(String[] args){
        int[] arr={23,45,67,8,9,25};
        System.out.println(minNumber(arr));

    }
    public static int minNumber(int []arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }


        }
        return min;
    }

}
