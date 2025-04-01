import java.util.Scanner;
public class AgeCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's age: ");
        int age = sc.nextInt();
        String category = categorizeAge(age);
        System.out.println("The person belongs to the '"+category+"' age group.");
        sc.close();
    }
    public static String categorizeAge(int age){
        if(age<13){
            return "Child";
        } else if(age<20){
            return "Teen";
        } else if(age<60){
            return "Adult";
        } else{
            return "Senior";
        }
    }
}
