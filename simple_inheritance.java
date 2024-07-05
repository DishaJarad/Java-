class simple {

    void simple1() {

        System.out.println("We are in super class");
    }

}

public class simple_inheritance extends simple {
    public static void main(String args[]) {

        simple_inheritance s1 = new simple_inheritance();
        s1.simple1();
    }

}
