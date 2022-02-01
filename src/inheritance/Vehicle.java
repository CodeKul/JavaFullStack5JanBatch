package inheritance;

public class Vehicle {
    int gear;
    int wheels;
}
class Car extends Vehicle{
    String color;
    String name;
    void insertData(int g,int w,String c,String nm){
       gear = g;
       wheels = w;
       color = c;
       name = nm;
    }
    void display(){
        // display all properties here
        System.out.println("Gears "+gear);
        System.out.println("No of wheels "+wheels);
        System.out.println("color "+color);
        System.out.println("name "+name);
    }
}

class CarImpl{
    public static void main(String[] args) {
        Car car = new Car();
        car.insertData(5,4,"White","MG-Hector");
        car.display();
    }
}