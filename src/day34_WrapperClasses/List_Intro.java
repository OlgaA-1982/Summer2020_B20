package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
          scores.add(95); // autoBoxing  0
          scores.add(100); //            1
          scores.add(85);  //            2
          scores.add(75);  //            3
          scores.add(1,65);  // 1

       // scores.add("Muhtar");

        // scores.add(6, 55);

        System.out.println(scores);

        System.out.println(  scores);


        // 100:
        System.out.println(scores.get(2));








    }
}
