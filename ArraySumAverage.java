public class ArraySumAverage {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        if (numbers.length == 0) {
            System.out.println("Array is empty. Cannot calculate sum and average.");
            return;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        int[] numbers2 = {5, 10, 15};
        sum = 0;
        for (int number : numbers2) {
            sum += number;
        }
        average = (double) sum / numbers2.length;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        int[] numbers3 = {};
        if (numbers3.length == 0) {
            System.out.println("Array is empty. Cannot calculate sum and average.");
        }
    }
}