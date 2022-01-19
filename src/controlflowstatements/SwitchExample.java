package controlflowstatements;

/***
 * Syntax :
 *  switch(expr) {
 *      case value1 :
 *      //code
 *      break; //optional
 *      case value2 :
 *      //code
 *      break;
 *      .
 *      .
 *      .
 *      .
 *      default : //optional
 *      //if all case are not matched in that case default code is get executed
 *  }
 */
public class SwitchExample {
    public static void main(String[] args) {
        int n1 = 5;
        switch (n1){ //2
            case 1:
                System.out.println("in Case 1");
                break;
            case 2:
                System.out.println("in Case 2");
                break;
            case 3:
                System.out.println("in Case 3");
                break;
            default:
                System.out.println("No matching case found");
        }
    }
}

/** Homework
 * 1) Print the month name by using nos
 *  1->Jan
 *  2->Feb
 *  .
 *  .
 *  .
 *  .
 *  12->Dec
 *  default
 *
 *  2) a,e,i,o,u -> vowels
 *  print "Vowels"
 *  default : "consonant"
 */