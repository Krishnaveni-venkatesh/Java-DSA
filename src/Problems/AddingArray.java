//input: num=[1,2,0,0] k=[3,4]
//output:[1,2,3,4]
//explanation=1200+34
package Problems;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AddingArray {
    public static List<Integer> addToArrayForm(int[] num, int[] k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int j = k.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num[i] : 0;
            int n2 = (j >= 0) ? k[j] : 0;

            int sum = n1 + n2 + carry;
            result.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }


        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int[] k = {3, 4};

        List<Integer> output = addToArrayForm(num, k);
        System.out.println(output);
    }
}

