package day10_IfStatements;

public class Character_Identify {

    public static void main(String[] args) {
        char character = 'A';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

        String alphabet = "";

        if (isAlphabetic == true) {
       //     System.out.println(character + " is Alphabetic character");
            alphabet= character +" is Alphabetic character";

     }else{
       //     System.out.println(character + " is not Alphabetic character");
        }

        System.out.println(alphabet);






















    }



}
