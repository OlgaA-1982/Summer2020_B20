package Office_Hours.Practice_07_14_20;

public class Uniqe {

    public static void main(String[] args) {

        String str = "ABABC";
        String expectedResult = "";

      char ch = str.charAt(0);
      int count = 0;
      for (int i = 0; i<= str.length()-1; i++){
          char each = str.charAt(i);
          if (each == ch){
              count+=1;

          }
      }

           if (count == 1){
               expectedResult += ch;
           }

        System.out.println(expectedResult);
































    }




}
