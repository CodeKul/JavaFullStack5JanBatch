package inheritance;

public class Bird {
    void eat(){
        System.out.println("in Bird class");
    }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("in sparrow class");
    }
}
class BabySparrow extends Sparrow{
    void weep(){
        System.out.println("in Baby Sparrow class");
    }
}
class BabySparrowImpl {
    public static void main(String[] args) {
        BabySparrow babySparrow = new BabySparrow();
        babySparrow.weep();
        babySparrow.eat();
        babySparrow.fly();

    }
}