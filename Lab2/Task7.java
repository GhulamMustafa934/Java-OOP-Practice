import java.util.Scanner;

public class Task7{

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter a String :");
	String str=sc.nextLine();

	System.out.print("Enter the sequence of String :");
	String sequence=sc.nextLine();

	if(str.contains(sequence)){
	System.out.println("The String contain the specified squence");
}

	else{
	System.out.println("The String does not contain the specified squence");
}

}
}
	
	