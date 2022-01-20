package controlflowstatements;

/**
 * Syntax:
 * for(data_type var_name:array){
 * }
 */
public class ForEachExample {
    public static void main(String[] args) {
        int a1[] = {12,15,45,75,95};
        for (int a:a1){
            System.out.println(a);
        }
    }
}
