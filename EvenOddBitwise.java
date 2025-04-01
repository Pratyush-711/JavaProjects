import java.util.Scanner;
public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        if(isEven(number)){
            System.out.println(number+ " is an even number.");
        } else {
            System.out.println(number+ " is an odd number.");
        }
        sc.close();
    }
    public static boolean isEven(int n){
        return(n&1) == 0;
    }
}
