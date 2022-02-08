package abstraction;

import java.util.Scanner;

public abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius = 5;

//    void insertData(double r){
//        radius = r;
//    }
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape{
    double length= 7 ,breadth = 8;
//    void insertData(double l,double b){
//        length = l;
//        breadth = b;
//    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Circle");
            System.out.println("2.Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Square");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    shape = new Circle();
                    System.out.println("Area of Circle "+shape.calculateArea());
                    break;
                case 2:
                    shape = new Rectangle();
                    System.out.println("Area of Rectangle "+shape.calculateArea());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!!!");
            }
        }while (ch<6);
    }
}