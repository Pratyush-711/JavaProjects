import java.util.Scanner;

public class ArrayElementOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find the occurrences of: ");
        int elementToFind = scanner.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == elementToFind) {
                count++;
            }
        }
        System.out.println(elementToFind + " occurs " + count + " times in the array.");

        scanner.close();
    }
}

