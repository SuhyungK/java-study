package 자바의정석;

public class SuperTest {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {
    int x = 10;
    String name;

    Parent2() {
        super();
    }

    Parent2(String name) {

    }

}

class Child2 extends Parent2 {
    int x = 20;

    Child2() {
        super();
    }

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}