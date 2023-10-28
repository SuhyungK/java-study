package egoing.oop;

public class MyOOP {

    public static void main(String[] args) {
        Print p1 = new Print("----");
//        p1.delimiter = "----";
        p1.a();
        p1.b();

        Print p2 = new Print("****");
//        p2.delimiter = "****";
        p2.a();
        p2.b();

        p1.a();
        p2.a();
        p1.b();
        p2.b();
    }

}
