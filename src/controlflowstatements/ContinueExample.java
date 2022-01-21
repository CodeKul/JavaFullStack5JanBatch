package controlflowstatements;

/**
 * - used in loop control statement when we need to jump to the next
 *  iteration
 */
public class ContinueExample {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
