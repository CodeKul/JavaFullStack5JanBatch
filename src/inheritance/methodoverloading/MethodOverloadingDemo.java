package inheritance.methodoverloading;

public class MethodOverloadingDemo {
    int add(int a,int b){
        int result = a+b;
        return result;
    }
    int add(int a,int b,int c){
        return a + b +c;
    }

    float add(int a,float f){
        return a+f;
    }

    float add(float a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        System.out.println(demo.add(10,20));
        System.out.println(demo.add(10,20,30));
        System.out.println(demo.add(10,5.0f));
        System.out.println(demo.add(10.5f,5));
    }
}
