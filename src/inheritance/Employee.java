package inheritance;

public class Employee {
    int salary = 50000;
}

class Developer extends Employee{
    int bonus = 10000;

    void calculateSalary(){
        int sal = bonus + salary;
        System.out.println("Total Salary is "+sal);
    }
}

class DeveloperImpl{
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.calculateSalary();
    }
}