package oops;

/**
 * new keyword - used to allocate memory at runtime,stored in Heap memory
 *
 */
public class Student {
    int id; //instance variable
    String name; //instance variable

    public static void main(String[] args) {
        //Creating an object of class Student
        Student s1;//reference variable
        s1 = new Student(); //Heap area,memory will gets allocated for s1 ref variable
        System.out.println(s1.id);
        System.out.println(s1.name);
        Student s2 = new Student();
    }
}
