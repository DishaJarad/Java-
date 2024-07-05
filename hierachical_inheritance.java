class simple {

    void simple1() {

        System.out.println("We are in super class(simple)");
    }
}

class simple1 extends simple {

    void simple2() {

        System.out.println("We are in base  class(simple1)");
    }
}

class simple2 extends simple {

    void simple3() {

        System.out.println("We are in base class(simple2)");
    }
}

public class hierachical_inheritance {

    public static void main(String args[]) {
        simple1 s1 = new simple1();
        s1.simple1();
        s1.simple2();

        simple2 s2 = new simple2();
        s2.simple1();
        s2.simple3();

    }

}