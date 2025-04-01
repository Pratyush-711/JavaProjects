import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        boolean isLeap = isLeapYear(year);
        if(isLeap){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year +" is not a leap year.");
        }
        scan.close();
    }
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                return year%400==0;
            } else{
                return true;
            }
        } else {
            return false;
        }
    }
}
