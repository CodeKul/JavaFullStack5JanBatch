package oops;
//3.14*r*r
public class Circle {
    int radius;
    void insertData(int r){
        radius = r;
    }
    void show(){
        System.out.println("Radius "+radius);
    }
    double calculateArea(){
        double area = 3.14 * radius * radius;
        //System.out.println("Area of Circle: "+area);
        return area;
    }
}
class CircleImpl{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.insertData(5);
        circle.show();
        double area = circle.calculateArea();
        System.out.println("Area of Circle "+area);
    }
}
