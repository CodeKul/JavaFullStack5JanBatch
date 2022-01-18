/**
 * Variables - container which holds value when the program gets executed
 *             name of memory location
 *
 *  Types :
 *  1. local variable - declared inside the body of the methods
 *                      we can use this variable only within that method
 *                      & other methods are not aware that variable
 *                      cannot be defined local variable with static keyword
 *
 *  2. instance variable - declared inside the class but outside the method body
 *                         not declared as static
 *  3. static variable - declared inside the class with static keyword
 *                       cannot be local
 *                       create a single copy of a static variable & share to all instances
 *                       of class
 *                       memory allocation happens only once when the class is loaded in the
 *                       memory
 */
public class Variables1 {
    int i=10; //instance variable
    static int m = 5; //static variable

    public static void main(String[] args) {
        int x = 150; //local variables
       // static int y = 10; // cannot be local
        System.out.println("X: "+x);
        System.out.println("M: "+m);
        float f = x;
        System.out.println("F: "+f); //widening
        //int z = f; //compile time error
        int z = (int)f; //typecasting
        System.out.println("Z: "+z);
        byte b = (byte)x; //overflow
        System.out.println("B: "+b);
    }
}
