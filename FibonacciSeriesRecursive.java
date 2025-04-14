import java.util.Scanner;

public class FibonacciSeriesRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which to display the Fibonacci series: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
            scanner.close();
            return;
        }

        System.out.println("Fibonacci series up to " + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}

