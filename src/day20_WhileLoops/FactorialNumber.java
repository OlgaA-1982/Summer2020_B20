package day20_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
        double result = 1; // 5 * 4 * 3 * 2 * 1

        for(int i = n; i >= 1; i --){ // i: 5,4,3,2,1
            result *= i;
        }

        System.out.println(result);




















































































    }

}
