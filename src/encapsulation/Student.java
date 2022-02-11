package encapsulation;

public class Student {
    private int id;
    private String name;
    private String password; //write only
    private int age = 18; //read only
    //setters - to set value
    //getters - to get value
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String nm){
        name = nm;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String pswd){
        password = pswd;
    }

    public int getAge() {
        return age;
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(1);
        System.out.println(s1.getId());
        s1.setName("abc");
        System.out.println(s1.getName());
        s1.setPassword("123456");
        //System.out.println(s1.getPassword());
        System.out.println(s1.getAge());

    }
}
