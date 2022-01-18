/***
 * Operators In Java
 * 1. Unary Operator -: expr++,expr--,++expr,--expr,+expr,-expr,~,!
 * 2. Arithmetic Operators -: +,-,*,/,%
 * 3. Left Shift Operators -: <<
 * 4. Right Shift Operator -: >>
 * 5. Logical Operator -: Logical AND(&&),Logical OR(||)
 * 6. Bitwise Operator -: Bitwise AND(&),Bitwise OR(|)
 * 7. Ternary Operator -: ? :
 * 8. Relational Operator -: <,>,<=,>=,instanceof
 * 9. Assignment Operator -: =,+=,-=,*=,/=
 */
public class Operators {

    public static void main(String[] args) {
        //Unary Operators

        int n = 62;
        System.out.println(n); //62
        System.out.println(n++); //62  // assign increment
        System.out.println(++n); //64 // increment assign
        System.out.println(n--);//64  // assign decrement
        System.out.println(--n);//62  // decrement assign
        System.out.println(n++ + ++n); //62 + 64 = 126
        int a = 25;
        int b = -25;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// (-a)-1 = -25-1=-26
        System.out.println(~b);//-(-a)-1 = 25-1 = 24
        System.out.println(!c); //false
        System.out.println(!d); //true
        //Arithmetic Operators
        System.out.println(20+2);//22
        System.out.println(20-2);//18
        System.out.println(20*2);//40
        System.out.println(20/2);//10
        System.out.println(20%7);//6
        System.out.println(15*5/2+3-4+25*6/3);

        // Left Shift Operators
        a = 20;
        b = 40;
        System.out.println(a<<2); // 20*2^2 = 40*2 = 80
        System.out.println(b<<3); // 40*2^3 = 40*8 = 320
        System.out.println(15<<4); // 15*2^4 = 15*16 = 240

        // Right Shift Operator
        System.out.println(a>>2); // 20/2^2 = 20/4 = 5
        System.out.println(b>>3); // 40/2^3 = 40/8 = 5
        System.out.println(48>>4); // 48/2^4 = 48/16 = 3

        //Logical|Bitwise Operator
        a = 20;
        b = 5;
        int x = 25;

        System.out.println(a<b && a<x); // false = false
        // if the first condition is false then logical && operator doesn't check the 2nd condition

        System.out.println(a<b & a<x); // false & true = false
        // always checks both conditions whether 1st condition is true or false

        System.out.println(a>b || a>x); //true  = true
        // if the first condition is true then logical || operator doesn't check 2nd condition
        //if the first condition is false then logical || operator checks 2nd condition

        System.out.println(a>b | a>x);
        //always checks both conditions whether 1st condition is true or false

    }
}
