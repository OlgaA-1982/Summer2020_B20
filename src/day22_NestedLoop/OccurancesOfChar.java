package day22_NestedLoop;

import java.util.Scanner;

public class OccurancesOfChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   String str = scan.nextLine();
   char ch = scan.next().charAt(0);

   int count = 0; // 1
/*
 for(int i=0; i <= str.length()-1; i++){

   char each = str.charAt(i); // a b a b c

     if( each == ch ){
         count += 1;
     }
 }
*/

        int index = 0;
        while(index <= str.length()){

            char each = str.charAt(index);

            if( each == ch) {
                count += 1;
            }

            index++;
        }



        System.out.println(count);















































    }


}
