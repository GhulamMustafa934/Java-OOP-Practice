import java.util.Scanner;
public class Task4{
    public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	System.out.print("Enter value a :");
	int a=sc.nextInt();

	System.out.print("Enter value b :");
	int b=sc.nextInt();

	int add= a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;

	System.out.println("The result od additon is :"+add);
	System.out.println("The result od subtraction is :"+sub);
	System.out.println("The result od multiplication is :"+mul);
	System.out.println("The result od division is :"+div);

}
}