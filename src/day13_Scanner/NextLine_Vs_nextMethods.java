package day13_Scanner;

import java.util.Scanner;

public class NextLine_Vs_nextMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name:"+fullName);



























    }
























}
