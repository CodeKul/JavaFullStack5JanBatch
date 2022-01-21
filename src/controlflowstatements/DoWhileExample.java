package controlflowstatements;

/**
 * - exit control loop
 * - it is executed at least once, even if the condition is false
 * Syntax:
 *  do {
 *      //code
 *  }while(condition);
 */
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
        //infinite do--while loop
//        do{
//            System.out.println("Hello");
//        }while (true);
    }
}
