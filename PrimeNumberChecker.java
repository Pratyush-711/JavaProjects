import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            scanner.close();
            return;
        }
        if (number <= 3) {
            System.out.println(number + " is a prime number.");
            scanner.close();
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                scanner.close();
                return;
            }
        }
        System.out.println(number + " is a prime number.");

        scanner.close();
    }
}
