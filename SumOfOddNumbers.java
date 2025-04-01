import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer N: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Please enter a positive integer.");
        } else{
            int sum = 0;
            for(int i=1;i<=n;i++) {
                if(i%2!=0){
                    sum+=i;
                }
            }
            System.out.println("The sum of odd numbers from 1 to "+n+ " is: "+sum);
        }
        sc.close();
    }
}
