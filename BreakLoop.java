import java.util.Scanner;

public class BreakLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter inputs (type 'exit' to quit):");

        while (true) {
            System.out.print("Enter input: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the loop.");
                break;
            }
            System.out.println("You entered: " + input);
        }
        scanner.close();
    }
}
