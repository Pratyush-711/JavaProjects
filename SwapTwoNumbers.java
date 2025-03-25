import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Before Swapping");
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);

       //Swap two numbers
       int temp = num1;
       num1 = num2;
       num2 = temp;

       System.out.println("\nAfter Swapping");
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
        input.close();
    }
}
