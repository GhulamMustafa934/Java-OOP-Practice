import java.util.Scanner;

public class Test{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number to find factorial");
		int a=sc.nextInt();

		int result=Factorial(a);
		
		System.out.println("Factorial of "+a+" is "+result);
	}


	static int Factorial(int a){

		if(a>1){
			return a*Factorial(a-1);
		}
		else{
			return 1;
		}
	}
}