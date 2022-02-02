package inheritance;

public class Employee1 {
    double salary = 50000;
    void display(){
        System.out.println("Salary is "+salary);
    }
}

class PermanentEmployee extends Employee1{
    double hike = 1.5;
    double calculateTotalSalary(){
       double totalSalary  = salary + (salary * hike)/100;
       return totalSalary;
    }
}

class TemporaryEmployee extends Employee1{
    double hike = 0.5;
    double calculateTotalSalary(){
        double totalSalary  = salary + (salary * hike)/100;
        return totalSalary;
    }
}
class Employee1Impl{
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee();
        double totalSalary = pe.calculateTotalSalary();
        System.out.println("Total salary of Permanent Employee is "+totalSalary);

        TemporaryEmployee te = new TemporaryEmployee();
        System.out.println("Total salary of Temporary Employee is "+te.calculateTotalSalary());
    }
}