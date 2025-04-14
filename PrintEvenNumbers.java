import java.util.Scanner;

public class PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            if (number % 2 != 0) {
                continue;
            }

            System.out.println(number);
        }

        System.out.println("End of program.");
        scanner.close();
    }
}
