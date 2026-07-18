import java.util.Scanner;

public class Task2{

public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter number of rows and columns : ");

	int rows=sc.nextInt();
	int cols=sc.nextInt();

	int value=1;

	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
		System.out.print(value +" ");
		value++;
		
}
	
	System.out.println();
}
	value=1;
	System.out.println("Even elements:");

	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (value % 2 == 0) {
                    System.out.print(value + " ");
                }
		value++;
}
}
}
}