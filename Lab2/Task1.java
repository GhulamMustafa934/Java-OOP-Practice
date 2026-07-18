import java.util.Scanner;

public class Task1{

public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);

	int fingers=(int)(Math.random()*6);

System.out.print("Guess the number of fingers up (0-5) :");
int guess=sc.nextInt();

	if(guess==fingers){
	System.out.println("You guessed it right.");
}
	else {
	System.out.println("You guessed it wrong.");
}

}

}
	