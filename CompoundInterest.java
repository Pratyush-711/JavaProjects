import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount(P): ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Annual Interest Rate(R): ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time Period(T): ");
        double time = sc.nextDouble();

        double CompoundInterest = principal*Math.pow(1+(rate/100),time);
        System.out.println("\nCompound Interest after "+time+" years: "+CompoundInterest);
        sc.close();
    }
}
