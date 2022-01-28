package oops;

/***
 * Method :
 *  to expose the behaviour of an object
 *  Advantage:
 *      1. Code Optimization
 *      2. Code Re-usability
 *
 */
public class Car {
    int gears;
    String carName;
    String color;
    void show(){
        System.out.println(gears +" "+carName+" "+color);
    }
}
class CarImpl{
    public static void main(String[] args) {
        Car c1 = new Car();
        //by using reference variable, we are going to initialize object
        c1.gears = 6;
        c1.color = "White";
        c1.carName = "Scoda-Octavia";
        c1.show();
        Car c2 = new Car();
        c2.gears = 6;
        c2.color = "Black";
        c2.carName = "MG-Hector";
        c2.show();
        Car c3 = new Car();
        c3.gears = 6;
        c3.carName = "Honda-City";
        c3.color = "Silver";
        c3.show();
    }
}
