import java.util.Scanner;

public class RightShiftOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the number of bits to right shift: ");
        int shiftBy = scanner.nextInt();

        // Signed Right Shift (>>)
        int signedRightShiftResult = number >> shiftBy;

        System.out.println("\nOriginal number: " + number);
        System.out.println("Binary representation: " + Integer.toBinaryString(number));
        System.out.println("Right shifted by " + shiftBy + " bits (signed >>): " + signedRightShiftResult);
        System.out.println("Binary representation: " + Integer.toBinaryString(signedRightShiftResult));

        // Unsigned Right Shift (>>>)
        int unsignedRightShiftResult = number >>> shiftBy;

        System.out.println("\nOriginal number: " + number);
        System.out.println("Binary representation: " + Integer.toBinaryString(number));
        System.out.println("Right shifted by " + shiftBy + " bits (unsigned >>>): " + unsignedRightShiftResult);
        System.out.println("Binary representation: " + Integer.toBinaryString(unsignedRightShiftResult));

        scanner.close();
    }
}