package Problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int n = arr.length+1;
        int totalsum=n*(n+1)/2;
        int sum=0;
        for (int num:arr){
            sum+=num;

        }
        System.out.println("missing number:"+(totalsum-sum));
    }
}
