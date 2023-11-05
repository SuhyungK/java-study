package 자바의정석;

public class InterfaceTest4 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstace();
        i.methodB();
    }
}

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {
    @Override
    public void methodB() {
        System.out.println("methodB in B3 class");
    }
}

class InstanceManager {
    public static I3 getInstace() {
        return new B3();
    }
}