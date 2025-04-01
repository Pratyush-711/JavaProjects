import java.util.Scanner;
public class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Enter the number of bits to left shift: ");
        int shiftBits = sc.nextInt();

        int result = num << shiftBits;
        System.out.println("Original number: "+num);
        System.out.println("Left shifted by "+shiftBits+ " bits: "+result);
        sc.close();
    }
}
