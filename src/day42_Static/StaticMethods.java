package day42_Static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        //System.out.println(this.a);

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
           // the Only way to call instance in a static methods

        staticMethod();
        StaticMethods.staticMethod();
       // instanceMethod();

        //StaticMethods.instenceMethod();
       // obj.instanceMethod();
    }

    public static void staticMethod(){

    }




}
