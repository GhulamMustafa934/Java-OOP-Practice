import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns :");
        int cols = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + (rows * cols) + " elements (row by row, separated by spaces or newlines):");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += sc.nextInt();
            }
        }

        System.out.println("Sum of Elements = " + sum);
        sc.close();
    }
}