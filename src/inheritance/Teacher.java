package inheritance;
//Hierarchical Inheritance
public class Teacher {
    int id;
    String name;
    String subject;
}
class PhysicsTeacher extends Teacher{
    void insert(){
        id = 1;
        name = "Mr. Patel";
        subject = "Physics";
    }
    void show(){
        System.out.println(" id "+id);
        System.out.println(" name "+name);
        System.out.println(" subject "+subject);
    }
}
class ChemistryTeacher extends Teacher{
    void insert(){
        id = 2;
        name = "Mr. Das";
        subject = "Chemistry";
    }
    void show(){
        System.out.println(" id "+id);
        System.out.println(" name "+name);
        System.out.println(" subject "+subject);
    }
}

class TeacherImpl{
    public static void main(String[] args) {
        PhysicsTeacher pt = new PhysicsTeacher();
        pt.insert();
        pt.show();

        ChemistryTeacher ct = new ChemistryTeacher();
        ct.insert();
        ct.show();
    }
}