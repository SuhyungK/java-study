package 자바의정석;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C2());
    }
}

interface I2 {
    public abstract void play();
}

class A2 {
    void autoPlay(I2 i) {
        i.play();
    }
}

class B2 implements I2 {
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C2 implements I2 {
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}
