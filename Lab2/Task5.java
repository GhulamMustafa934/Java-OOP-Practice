public class Task5{

	public static void main(String args[]){

	int[] array={10, 19, 5, 1, 7, 14, 0, 7, 5};

	System.out.println("Element\tValues\tHistogram");

	for(int i=0;i<array.length;i++){
	System.out.print(i+"\t"+array[i]+"\t");

	for(int j=0;j<array[i];j++){
	System.out.print("*");
}
	System.out.println();

}

}
}  