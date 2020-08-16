package day05_ArithmeticOperators;
/*Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
*/
public class EmployeeInfo {
     public static void main(String[] args) {

         String firstName = "Aaron";
         String lastName = "Jones";
         int age = 45;
         String companyName = "CapitalOne";
         char gender = 'M';
         String jobTitle = "QA";
         boolean isFullTime = true;
         boolean isMarried = false;
         double salary = 120_000.50;
         String fullName = firstName+ " " + lastName; // "Aaron Jones"

         System.out.println("Employee' full name is: " + firstName);
         System.out.println(fullName +"' gender is:" + gender );
         System.out.println(fullName +"' age is:" + age + "years old");
         System.out.println(fullName + " works at: "+companyName );
         System.out.println(fullName +"' job title is: " + jobTitle);
         System.out.println(fullName +"' salary is: $"+salary);
         System.out.println(fullName +" is full time employee: "+ isFullTime);
         System.out.println(fullName +"is married:" + isMarried );




    }











}
