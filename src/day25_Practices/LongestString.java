package day25_Practices;

public class LongestString {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abuduljabar", "Mamatursun","VasilisaPutulica"};

        int maxLength = arr[0].length(); // 4

            for (String each : arr) {
                if (each.length() > maxLength) {
                    maxLength = each.length();
                }
            }

            for (String each: arr){
                if (each.length() == maxLength){
                    System.out.println(each);
                }
            }















        }























































}
