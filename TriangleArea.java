import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the rectangle(B): ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the rectangle(H): ");
        double height = sc.nextDouble();
        double area = 0.5*base*height;

        System.out.println("The base of the rectangle is: "+base);
        System.out.println("The height of the rectangle is: "+height);
        System.out.println("The Area of the Triangle is: "+area);
        sc.close();
    }
}
