package Problems;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number to search: ");
            int target = sc.nextInt();
            boolean found = false;
            for (int num : arr) {
                if (num == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(target +" is present in the array");
            } else {
                System.out.println(target +" is not found in the array");
            }
            sc.close();
        }
    }


