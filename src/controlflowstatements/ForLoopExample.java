package controlflowstatements;

/**
 * Syntax :
 *      for(initialization;condition;increment/decrement){
 *          //code
 *      }
 */
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }

        for (;;){
            System.out.println("infinite loop");
        }
    }
}

//Table of any no
// no * i
