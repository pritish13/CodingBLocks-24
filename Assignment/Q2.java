package Assignment;

public class Q2 {
    public static void main(String[] args) {
        int rows = 5; // number of rows in the pyramid
        for (int i = 0; i < rows; i++) {
            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("       ");
            }
            // print asterisks
            for (int k = 0; k < rows - i; k++) {
                System.out.print("  *   ");
            }
            System.out.println();
        }
        // print the lower part of the pyramid
        for (int i = rows - 2; i >= 0; i--) {
            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("       ");
            }
            // print asterisks
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" *   ");
            }
            System.out.println();
        }
    }
}
