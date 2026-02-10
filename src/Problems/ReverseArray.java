package Problems;
import java.util.Arrays;
public class ReverseArray {
        public static int[] reverseArray(int[] arr){
            int i=0,j=arr.length-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] arr={3,4,5,6,7,8,9};
            int[] result=reverseArray(arr);
            System.out.println(Arrays.toString(result));
        }
    }