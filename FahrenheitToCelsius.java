import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit-32)*5.0/9.0;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to "+celsius+" degree Celsius.");
        sc.close();
    }
}
