
package Problems;

import java.util.ArrayList;
import java.util.HashMap;

/*
arr=[1,2,3,4,5]
contigous arr=[[1],[1,2],[1,2,3],[1,2,3,4],[1,2,3,4,5],[2,3,4,5],[2,3,4],[2,3],[2]]


collection framework = > wrapper class datatypes
List , Map, Set => interfaces
ArrayList, HashMap, HashSet  = classes which implement interface
 */
public class SubArray {
    public static ArrayList<ArrayList<Integer>> subArray(int[] arr){
        ArrayList<ArrayList<Integer>>  result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ArrayList<Integer> sub = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    sub.add(arr[k]);
                }
                result.add(sub);

                System.out.println();
            }
        }
        return result;

    }
    public static void  main(String[] args) {

        int[] x = {1,2,3,4,5};
        System.out.println(subArray(x));


    }
}
