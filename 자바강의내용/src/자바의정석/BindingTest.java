package 자바의정석;

public class BindingTest {

    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println(p.x);
        System.out.println(c.x);
        p.write();
    }
}

class Parent3 {
    int x = 100;
    void write() {
        System.out.println("Parent write");
    }
}

class Child3 extends Parent3 {
    int x = 200;
    void write() {

        System.out.println("x = " + x);
        System.out.println("x = " + super.x);
        System.out.println("x = " + this.x);
    }
}
