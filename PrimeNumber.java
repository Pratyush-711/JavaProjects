public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 10;
        int num3 = 2;
        int num4 = 1;
        int num5 = 0;
        int num6 = -5;

        System.out.println(num1 + " is prime: " + isPrime(num1));
        System.out.println(num2 + " is prime: " + isPrime(num2));
        System.out.println(num3 + " is prime: " + isPrime(num3));
        System.out.println(num4 + " is prime: " + isPrime(num4));
        System.out.println(num5 + " is prime: " + isPrime(num5));
        System.out.println(num6 + " is prime: " + isPrime(num6));
    }
}