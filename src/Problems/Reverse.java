package Problems;
import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse:");
        String inputString = sc.next();
        char[] str = inputString.toCharArray();

        reverseString(str);
        System.out.println("Reversed String: " + new String(str)); // Clean output


    }
}


