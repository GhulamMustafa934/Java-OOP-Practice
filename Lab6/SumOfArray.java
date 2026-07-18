import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        int sum = 0;
        
        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        
        System.out.println("\nSum of all elements stored in the array is: " + sum);
        

    }
}