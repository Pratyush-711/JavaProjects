import java.util.Scanner;
public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int complement = ~num;
        System.out.println("Original number: "+num);
        System.out.println("Bitwise complement of "+num+ " is: "+complement);
        sc.close();
    }
}
