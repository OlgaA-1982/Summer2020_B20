package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Unigues {

    public static void main(String[] args) {
        String str = "AAAABBCDDEF";
        String unigues = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split( "")){
            list.add(each);
        }
        System.out.println(list);

        for (String each : list) {

            int count = Collections.frequency(list, each);
            if (count == 1) {
                unigues += each;
            }

        }
        System.out.println(unigues);


    }
}
