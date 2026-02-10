package Problems;

public class SecondSmallest {
    public static int secondSmallest(int[] arr){
        int smallest=arr[0];
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }

        return secondsmallest;
    }
    public static void main(String[] args) {
        int[] arr={1,3,3,7,6,9,8};

        System.out.println(secondSmallest(arr));
    }
}
