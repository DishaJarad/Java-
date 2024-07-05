class simple {
    void simple1() {
        System.out.println("We are in super class(simple)");

    }

}

class simple1 extends simple {
    void simple2() {
        System.out.println("We are in base class (simple1)");
    }

}

class simple2 extends simple1 {
    void simple3() {
        System.out.println("We are in base class (simple2)");
    }

}

public class multilevel_inheritance extends simple2 {

    void simple4() {
        System.out.println("We are in base class (multilevel_inheritance)");

    }

    public static void main(String arg[]) {

        multilevel_inheritance m1 = new multilevel_inheritance();
        m1.simple1();
        m1.simple2();
        m1.simple3();
        m1.simple4();
    }

}
