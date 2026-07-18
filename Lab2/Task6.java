import java.util.Scanner;

public class Task6{

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x = 10;");
        System.out.println("b. int x = 10;");
        System.out.println("c. float x = 10.0f;");
        System.out.println("d. String x = \"10\";");

	System.out.print("Enter your choice =");
	char choice=sc.next().charAt(0);

	switch(choice){

	case 'b':
	case 'B':
	System.out.println("Correct answer");
	break;

	case 'a':
	case 'A':
	case 'c':
	case 'C':
	case 'd':
	case 'D':
	System.out.println("Wrong answer");
	break;

	default:
	System.out.println("Invalid choice");

}

}

}