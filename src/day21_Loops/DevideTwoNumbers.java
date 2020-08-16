package day21_Loops;

public class DevideTwoNumbers {

    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0); // forcefully terminating the program
        }

        int count = 0;

        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);
























































    }


}
