package day25_Practices;

public class ShortestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nikolas", "Amir", "Nurmamet", "Tony", "Adam","Musa","Alan"};
        int minLength = arr[0].length();

        for ( String each : arr){ // to find out the minimum length of the string in arr
            int l = each.length();// 4 8 4 8

            if (l < minLength){
                minLength = l;
            }
        }

        for (String each : arr){
            if (each.length() == minLength){
                System.out.println(each);
            }
        }

















































































    }


}
