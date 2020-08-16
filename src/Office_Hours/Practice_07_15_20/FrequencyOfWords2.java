package Office_Hours.Practice_07_15_20;

import java.util.Scanner;

public class FrequencyOfWords2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
      // String str = "JavajavaJavajavaJAVA".toLowerCase();

       int count = 0; // 1
       while(str.contains("java")){ // true
           count++;
         str =  str.replaceFirst("java", "");
       }


        System.out.println(count);







    }






}
