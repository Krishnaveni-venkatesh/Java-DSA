/*input={5,7,90,23,5,6};
output=23 (second largest element in the above array)
 */
package Problems;
import java.util.Arrays;

public class SecondLargestElementInArr {
    public static int secondLar(int[] arr){
        int largest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondl=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>secondl && arr[i]!=largest){
                secondl=arr[i];
            }

        }
        return secondl;
    }
    public static void main(String[] args){
        int[] arr={5,7,90,23,5,6};
        System.out.println(secondLar(arr));
    }
}
