package Office_Hours.Practice_07_28_2020;

public class Method_Practice {


    public static void main(String[] args) {
        String name = "Muhtar";

        String reversedName = reverseStr(name);
        System.out.println(reverseStr(name));

        System.out.println(reversedName.toUpperCase());

          isPalindrome("Level");
          isPalindrome(name);

    }


    public static String reverseStr (String str){ // "ABC"
        String result = "";  // CB

        for (int i = str.length()-1; i >= 0; i --){
           result += str.charAt(i); // C B A
        }

        return result;

    }

   public static void isPalindrome(String str){ //ABC
        String reversedStr = reverseStr(str);  // CBA
       boolean palindrome = str.equalsIgnoreCase(reversedStr); // do not use ==

       System.out.println( palindrome? str+"Is Palindrome" : str+"Is Not Palindrome");

   }

}
