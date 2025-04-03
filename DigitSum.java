public class DigitSum {

    public static int sumOfDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 12345;
        int number2 = -987;
        int number3 = 0;
        int number4 = 1;

        System.out.println("Sum of digits of " + number1 + ": " + sumOfDigits(number1));
        System.out.println("Sum of digits of " + number2 + ": " + sumOfDigits(number2));
        System.out.println("Sum of digits of " + number3 + ": " + sumOfDigits(number3));
        System.out.println("Sum of digits of " + number4 + ": " + sumOfDigits(number4));
    }
}