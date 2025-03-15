package Problems;
/*
  PROBLEM STATEMENT

  Checking if 19 is a Happy Number
Let's check step-by-step:

19 → (1² + 9²) = 1 + 81 = 82
82 → (8² + 2²) = 64 + 4 = 68
68 → (6² + 8²) = 36 + 64 = 100
100 → (1² + 0² + 0²) = 1



 */
public class HappyNumber {
    public static boolean happynumber(int n) {
        while (n != 1 && n != 20) {
            n = getSumOfSquares(n);
        }
        return n == 1;
    }
    public static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 129;
        System.out.println(num + " is a happy number "+ happynumber(num));
    }
}













