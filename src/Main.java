import ABC.A;
import ABC.B;
import ABC.C;

final public class Main {

    public static void main(String[] args) {
        Car myCar = new BMW();
        myCar.run();

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        /*
        b.m1();
        c.m2();
        a.m3();
        */

        /*
        c.m1();
        c.m2();
        c.m3();
        */

        /*
        a.m1();
        b.m2();
        c.m3();
        */

        a2.m1();
        a2.m2();
        a2.m3();

        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        RowBoat b3 = new RowBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();

    }


}
