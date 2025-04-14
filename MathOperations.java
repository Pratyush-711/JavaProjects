public class MathOperations {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        int sum1 = mathOps.add(5, 10);
        System.out.println("Sum of two numbers: " + sum1);
        int sum2 = mathOps.add(5, 10, 15);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
