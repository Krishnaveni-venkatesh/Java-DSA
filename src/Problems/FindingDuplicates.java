package Problems;

import java.util.HashSet;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7};
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicates:");
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
