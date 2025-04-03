public class FibonacciSeries {

    public static void printFibonacci(int limit) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + limit + ": ");

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit1 = 10;
        int limit2 = 50;
        int limit3 = 0;
        int limit4 = 1;

        printFibonacci(limit1);
        printFibonacci(limit2);
        printFibonacci(limit3);
        printFibonacci(limit4);

    }
}