import java.util.Scanner;

public class Task7{

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	boolean e=true;

	int rows=sc.nextInt();
	int cols=sc.nextInt();

	int m1[][]=new int[rows][cols];
	int m2[][]=new int[rows][cols];

	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			m1[i][j]=sc.nextInt();
}
}

	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			m2[i][j]=sc.nextInt();
}
}
	for(int i=0;i<rows;i++){
            for(int j=0;j<cols; j++){

                if(m1[i][j] != m2[i][j]){
                    e=false;
                    break;
                }
            }
        }
	if (e) {
            System.out.println("Both matrices are equal");
        } else {
            System.out.println("Both matrices are not equal");
        }
    }
}