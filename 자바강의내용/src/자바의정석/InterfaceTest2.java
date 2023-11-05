package 자바의정석;

class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}

interface I {
    public abstract void methodB();
}

class A {
    public void methodA (I i) {
        i.methodB();
    }
}

class B implements I {
    public void methodB() {
        System.out.println("method B ()");
    }
}
