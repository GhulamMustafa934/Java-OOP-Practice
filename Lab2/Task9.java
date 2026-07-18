import java.util.Scanner;
import java.util.Random;

public class Task9{

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	Random rand=new Random();

	int coin=rand.nextInt(2);

	System.out.println("Guess the Flip Coin");
	System.out.print("Enter 0 for Head and 1 for Tail :");
	int guess=sc.nextInt();

	if(guess==coin){
	System.out.print("You have guessed the right");

}	else{
	System.out.println("You have guessed the wrong.");
}

	if(coin==0){
	System.out.println("Coin result =Head");
}
	else{
	System.out.println("Coin result =Tail");

}

}

}