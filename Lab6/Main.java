import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[10];

        System.out.println("Input 10 elements inthe array.");

        for(int i=0;i<10;i++){
            System.out.print("element -" + i + " : ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements in the array are : ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}