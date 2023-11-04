package 자바의정석;

class Parent {
    static void getData() {
        System.out.println("부모 클래스");
    }
}

class Child extends Parent {
//    @Override
    static void getData() {
        System.out.println("자식 클래스");
    }
}

public class StaticExtendTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        Parent.getData();
        Child.getData();

        p.getData();
        c.getData();

    }
}
