public class Task5{
    public static void main(String args[]){

        boolean A = true;
        boolean B = false;
        boolean C = true;

        if (A && B && !C){
            System.out.println("Condition 1 is true");
        }

        if (A || B || C){
            System.out.println("Condition 2 is true");
        }

        if ((A && B && C) || (!A && !B && !C)){
            System.out.println("Condition 3 is true");
        }

        if (A && B) {
            System.out.println("Condition 4 is true");
        }
    }
}