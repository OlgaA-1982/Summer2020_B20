package day39_CustomeClass;

public class Car {
    /*
    Attributes:
    model, brand, year, color, mileadge, price
     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){

    }
    // sets the info of the car objects

    // 2012 Toyota Corolla,Red,10000,$ 45000
    public void getCarInfo() {
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + ", $" + price);

    }




/*
car1: Toyota
car2: BMW
car3: Tesla
 */
}




