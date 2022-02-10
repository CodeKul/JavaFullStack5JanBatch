package accessmodifiers.p3;

import accessmodifiers.p2.Simple;

public class SimpleImpl extends Simple{
    public static void main(String[] args) {
        //not accessible outside the package
        //Simple simple = new Simple();
        //simple.getMsg();

        // through the child or by extending the class we can access protected data member
        //outside the package
        SimpleImpl s1 = new SimpleImpl();
        s1.getMsg();
    }
}
