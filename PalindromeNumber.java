public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 12321;
        int num3 = 123;
        int num4 = 1;
        int num5 = 0;
        int num6 = 1221;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));
        System.out.println(num3 + " is a palindrome: " + isPalindrome(num3));
        System.out.println(num4 + " is a palindrome: " + isPalindrome(num4));
        System.out.println(num5 + " is a palindrome: " + isPalindrome(num5));
        System.out.println(num6 + " is a palindrome: " + isPalindrome(num6));
    }
}