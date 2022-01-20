package controlflowstatements;

/**
 *      * * * * *
 */
public class NestedForExample2 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("* ");
            } System.out.println();
        }
    }
}
/**
 *  i   j
 *  1   1
 *  1   2
 *  1   3
 *  1   4
 *  1   5
 *  1   6
 *  2   1
 * */
