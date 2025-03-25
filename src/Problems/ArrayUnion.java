package Problems;
import java.util.HashSet;

public class ArrayUnion {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr1) set.add(num);//adding elements to the set
            for (int num : arr2) set.add(num);
            System.out.println("Union: " + set);
        }
    }


