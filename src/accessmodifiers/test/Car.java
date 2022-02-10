package accessmodifiers.test;

public class Car extends Vehicle{
    void display(){
        //System.out.println(wheels);
        System.out.println(publicDataMember); //accessible anywhere
        System.out.println(protectedDataMember);
        System.out.println(defaultDataMember);
    }
}
