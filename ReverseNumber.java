public class ReverseNumber {

    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseDigits(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);

        num = 100;
        reversedNum = reverseDigits(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);

        num = -123;
        reversedNum = reverseDigits(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);

        num = 0;
        reversedNum = reverseDigits(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);

    }
}