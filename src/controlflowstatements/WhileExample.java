package controlflowstatements;

/**
 * Syntax:
 * while(condition){
 *     // code
 * }
 */
public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5){
            System.out.println("i:"+i);
            i++;
        }
        //infinite while loop
        while (true){
            System.out.println("Hello");
        }
    }
}
