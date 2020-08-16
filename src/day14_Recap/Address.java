package day14_Recap;

import java.util.Scanner;

/*
write a program for the shipping info that, the program should ask:
                    building number (
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine()
 */
public class Address {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
         int buildingNumber = scan.nextInt();

         scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String stateName = scan.next();

        System.out.println("Enter your zipcode:");
        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

    /*

        Ship to: Jimmy Joe
               7925 Jonse Branch Dr
                 Mclean, VA 22102
*/
        System.out.println("\nShip To: "+fullName+"\n"+buildingNumber+" "+streetAddress+"\n" +
                cityName+" , "+stateName+" "+zipcode);





















    }


}
