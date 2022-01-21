package controlflowstatements;

/**
 * - terminates the loop
 * - breaks the current flow of the program at the specified condition
 */
public class BreakExample {
    public static void main(String[] args) {
        for (int i =1;i<=10;i++){
            if (i==7){
                break;
            }
            System.out.println(i);
        }
    }
}
