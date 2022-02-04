package polymorphism;

public class Bike {
    int speed=100;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class Pulsur extends Bike{
    int speed = 120;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class Honda extends Bike{
    int speed = 80;
    void display(){
        System.out.println("Speed is "+speed);
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Bike bike = new Pulsur(); //upcasting
        bike.display();

        Bike bike1 = new Honda(); //upcasting
        bike1.display();
    }
}
