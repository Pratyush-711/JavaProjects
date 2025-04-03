public class PyramidPatterns {

    public static void rightHalfPyramid(int rows) {
        System.out.println("Right Half Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseRightHalfPyramid(int rows) {
        System.out.println("Reverse Right Half Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int rows) {
        System.out.println("Left Half Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5;

        rightHalfPyramid(numRows);
        System.out.println();

        reverseRightHalfPyramid(numRows);
        System.out.println();

        leftHalfPyramid(numRows);
    }
}