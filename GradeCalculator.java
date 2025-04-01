import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's marks: ");
        int marks = sc.nextInt();
        if(marks>100||marks<0){
            System.out.println("Invalid marks entered.");
        } else {
            char grade = calculateGrade(marks);
            System.out.println("The grade for "+marks+ "% is: "+grade);
        }
        sc.close();
    }
    public static char calculateGrade(int marks){
        if(marks>90) {
            return 'A';
        } else if(marks>75) {
            return 'B';
        } else if(marks>60){
            return 'C';
        } else if(marks>30){
            return 'D';
        } else {
            return 'F';
        }
    }
}
