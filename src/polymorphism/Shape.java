package polymorphism;

public class Shape {
    void calculateArea(){
        System.out.println("Calculate");
    }
}

class Circle extends Shape{
    float radius = 5;
    void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle : "+area);
    }
}
class Triangle extends Shape{
    float base = 5,height = 5;
    void calculateArea(){
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle "+area);
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
        shape = new Triangle();
        shape.calculateArea();
    }
}