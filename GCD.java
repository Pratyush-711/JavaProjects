public class GCD {
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcdIterativeResult = gcdIterative(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (iterative): " + gcdIterativeResult);

        int gcdRecursiveResult = gcdRecursive(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (recursive): " + gcdRecursiveResult);

        num1 = 25;
        num2 = 15;

        gcdIterativeResult = gcdIterative(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (iterative): " + gcdIterativeResult);

        gcdRecursiveResult = gcdRecursive(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (recursive): " + gcdRecursiveResult);

        num1 = 13;
        num2 = 17;

        gcdIterativeResult = gcdIterative(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (iterative): " + gcdIterativeResult);

        gcdRecursiveResult = gcdRecursive(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (recursive): " + gcdRecursiveResult);
    }
}