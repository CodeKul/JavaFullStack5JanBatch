package accessmodifiers;

public class Student {
    private int id;
    private String name;
    private String address;
    private void show(){
        name = "sam";
        System.out.println("show method");
    }
}

class StudentImpl{
    public static void main(String[] args) {
        Student student = new Student();
        //private members not accessible out the class
        //student.id;
        //student.show();
    }
}