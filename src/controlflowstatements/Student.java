package controlflowstatements;

public class Student {
    public static void main(String[] args) {
        int m1 = 75;
        int m2 = 85;
        String city = "Pune1";
        String address = "Kothrud,411028";
        //Simple if
        if (m1>80) {
            System.out.println("Distinction");
        }
        //if-else
        if (m1>80){
            System.out.println("Distinction");
        }else {
            System.out.println("First class");
        }

        //if-else-if ladder
        if (city == "Mumbai"){
            System.out.println("Student is from Mumbai");
        }else if (city == "Bangalore"){
            System.out.println("Student is from Bangalore");
        }else if (city == "Pune"){
            System.out.println("Student is from Pune");
        }else{
            System.out.println(city);
        }
        //Nested if
        if (city=="Pune"){
            if (address == "Kothrud,411028"){
                System.out.println("Welcome to Kothrud");
            }else {
                System.out.println("Welcome to Warje");
            }
        }else {
            System.out.println("You are not from Pune");
        }
    }
}

/**
 * HomeWork
 * Check whether the given no is Even or Odd
 * use % operator
 * int x  = 10 --- given no is even
 * int x = 11 --- given no is odd
 */
