import java.util.Scanner;

public class Task3{

public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter number of rows and columns : ");

	int rows=sc.nextInt();
	int cols=sc.nextInt();

	int value=1;
	int count=0;

	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(value+" ");
			
			if(value % 2 !=0){
			count++;
}
		value++;
}
	System.out.println();
}
	System.out.println("Count of odd is : " + count);
	
}
}