package abstraction;

public class Car extends Vehicle{
    int wheels = 4;
    void start(){
        System.out.println("Start with key");
    }
}

class Bike extends Vehicle{
    int wheels = 2;
    void start(){
        System.out.println("Start with button");
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle;// reference variable/object
        vehicle = new Car();
        vehicle.start();
        System.out.println(vehicle.wheels);
        vehicle = new Bike();
        vehicle.start();
        System.out.println(vehicle.wheels);
        vehicle.display();
        vehicle.stop();
        Vehicle.show();

    }
}