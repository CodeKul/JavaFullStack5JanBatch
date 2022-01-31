package inheritance;
//Single Inheritance
public class Animal {
    void eat(){
        System.out.println("in parent class");
    }
}
class Dog extends Animal{

    void walk(){
        System.out.println("in child class");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}
