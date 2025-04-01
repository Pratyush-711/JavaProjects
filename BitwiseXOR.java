import java.util.Scanner;
public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = sc.nextInt();
        int result = num1 ^ num2;
        System.out.println("Bitwise XOR of "+num1+" is: "+result);
        sc.close();
    }
}
