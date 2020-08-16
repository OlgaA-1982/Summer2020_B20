package day12_Swich_Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 7;
    String result = "";

        switch(month){

            case 4:
            case 6:
            case 9:
            case 11:
                result = ("30 Days");
                 break;

            case 2:
                result = ("28 Days");
                break;
                // 1,3,5,7,8,10,12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = ("31 Days");
                break;

            default:
                System.out.println("result");


        }

/*
       int a = 10;
           a = 20;
           a = 30;
           a = 50;
        System.out.println(a);

        */


































    }


}
