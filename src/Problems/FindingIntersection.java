package Problems;
import java.util.HashSet;

public class FindingIntersection {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};
            HashSet<Integer> set = new HashSet<>();

            for (int num : arr1) set.add(num);

            System.out.print("Intersection: ");
            for (int num : arr2) {
                if (set.contains(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }


