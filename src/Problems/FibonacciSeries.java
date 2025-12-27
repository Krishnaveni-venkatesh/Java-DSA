package Problems;

 public class FibonacciSeries {
    public static int printFibonacci(int n) {
        if(n<=1){
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}


