import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println("The number "+number+" is positive.");
        } else if(number<0) {
            System.out.println("The number "+number+" is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
