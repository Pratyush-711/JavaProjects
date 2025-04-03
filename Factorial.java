public class Factorial {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int num3 = -3;

        long factorial1 = calculateFactorial(num1);
        long factorial2 = calculateFactorial(num2);
        long factorial3 = calculateFactorial(num3);

        System.out.println("Factorial of " + num1 + " is: " + factorial1);
        System.out.println("Factorial of " + num2 + " is: " + factorial2);
        System.out.println("Factorial of " + num3 + " is: " + factorial3);
    }
}