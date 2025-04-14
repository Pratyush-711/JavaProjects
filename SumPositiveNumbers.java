import java.util.Scanner;

public class SumPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers (enter a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Sum of positive numbers: " + sum);
                break;
            }

            if (number == 0) {
                continue;
            }

            sum += number;
        }

        scanner.close();
    }
}
