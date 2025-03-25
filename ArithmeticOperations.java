import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        //Addition
        double sum = num1 + num2;
        System.out.println("Sum: " +num1+ "+" +num2+ "="+sum);
        //Subtraction
        double sub = num1 - num2;
        System.out.println("Subtraction: " +num1+ "-" +num2+ "="+sub);
        //Multiplication
        double mul = num1 * num2;
        System.out.println("Multiplication: " +num1+ "*" +num2+ "="+mul);
        //Division
        double div = num1/num2;
        System.out.println("Division: " +num1+ "/" +num2+ "="+div);
        //Remainder
        double rem = num1%num2;
        System.out.println("Remainder: " +num1+ "%" +num2+ "="+rem);
        input.close();
    }
}
