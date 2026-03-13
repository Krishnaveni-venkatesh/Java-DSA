package Problems;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayUnion {
    public static int[] unionOfTwoSortedArray(int[]arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }for(int num:arr2){
            set.add(num);
        }
        int[] result=new int [set.size()];
        int index=0;
        for(int num:set){
            result[index]=num;
            index++;
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={3,4,5,6};
        int[] union=unionOfTwoSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(union));
    }


    }


