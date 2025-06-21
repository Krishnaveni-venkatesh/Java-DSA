package Problems;

public class PrimeNumber {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "The number is not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "The number is not a prime number";
            }
        }
        return "The number is a prime number";
    }

    public static void main(String[] args) {
        String result = isPrime(49);
        System.out.println(result);

    }
}





