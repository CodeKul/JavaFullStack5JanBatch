package accessmodifiers.p1;

import accessmodifiers.Employee;

public class EmpImpl {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //default not accessible out the package
       // employee.id = 1;
      //  employee.display();
    }
}
