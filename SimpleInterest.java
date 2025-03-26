import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount(P): ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Time Period(T): ");
        double time = sc.nextDouble();
        System.out.println("Enter the Rate of Interest(R): ");
        double rate = sc.nextDouble();
        double SimpleInterest = (principal*time*rate)/100;

        System.out.println("/n---Calculation Result---");
        System.out.println("Principal Amount(P): "+principal);
        System.out.println("Time Period(T): "+time+" years");
        System.out.println("Rate of Interest(R): "+rate+ " %");
        System.out.println("Simple Interest: "+SimpleInterest);
        sc.close();
    }
}
