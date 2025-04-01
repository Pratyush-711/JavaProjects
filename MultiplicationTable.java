import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("\nMultiplication Table for "+num+ ":");
        for(int i=1;i<=10;i++){
            int product = num*i;
            System.out.println(num+ " x "+i+ " = "+product);
        }
        sc.close();
    }
}
