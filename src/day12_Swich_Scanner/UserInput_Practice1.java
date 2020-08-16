package day12_Swich_Scanner;

import java.util.Scanner;

public class UserInput_Practice1 {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your number:");
          double num = scan.nextDouble();

          String result = (num %2 == 0) ? " is Even" : num+ " is Odd number";

        System.out.println(result);



























    }


}
