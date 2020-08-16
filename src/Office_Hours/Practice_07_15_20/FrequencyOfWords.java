package Office_Hours.Practice_07_15_20;

public class FrequencyOfWords {

    public static void main(String[] args) {
        String original = "dog dog dog cat cat cat cat cat";
      String str = original;
        int countOfDog = 0; // 1+1+1

        while (str.contains("dog")){ // : true true true

           str = str.replaceFirst("dog", "");
           // "dog dog"
            // "dog"
            // ""
            countOfDog++;
        }
        int countOfcat = 0; // 1+1+1

        while (str.contains("cat")) { // : true true true

            str = str.replaceFirst("cat", "");
            countOfcat++;
        }
        System.out.println("Dog "+countOfDog);
        System.out.println("Cat "+countOfcat);









































    }



}
