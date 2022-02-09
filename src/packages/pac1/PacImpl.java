package packages.pac1;

import packages.*;

import packages.pac1.pac2.P3;

import java.util.Date;


public class PacImpl {
    public static void main(String[] args) {
        P1 p1 =  new P1();
        p1.show();

        P2 p2 = new P2();
        p2.show();

        P3 p3 = new P3();

       packages.pac1.pac2.P1 p11 = new packages.pac1.pac2.P1();
       p11.show();
    }
}
