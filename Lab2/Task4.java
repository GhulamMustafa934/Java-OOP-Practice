import java.util.Scanner;

public class Task4{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter a sentence :");
	String sen=sc.nextLine();

	sen=Character.toUpperCase(sen.charAt(0))+sen.substring(1);

	if(!sen.endsWith(".")){
	sen +=".";
}
	System.out.print("Beautified sentence :"+sen);

}
}
	