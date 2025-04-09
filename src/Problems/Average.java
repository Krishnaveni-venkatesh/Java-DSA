package Problems;

public class Average {
    public static void main(String[] args) {
        int[] arr={23,45,67,89,34};
        int sum=0;
        for(int i = 0; i < arr.length; i++){
            sum=sum+arr[i];
        }
     double average =sum/arr.length;
        System.out.println(average);

    }

}
