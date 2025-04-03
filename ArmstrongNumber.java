public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); 

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num1 = 153;
        int num2 = 123;
        int num3 = 0;
        int num4 = 1;
        int num5 = 1634;

        System.out.println(num1 + " is Armstrong: " + isArmstrong(num1));
        System.out.println(num2 + " is Armstrong: " + isArmstrong(num2));
        System.out.println(num3 + " is Armstrong: " + isArmstrong(num3));
        System.out.println(num4 + " is Armstrong: " + isArmstrong(num4));
        System.out.println(num5 + " is Armstrong: " + isArmstrong(num5));
    }
}