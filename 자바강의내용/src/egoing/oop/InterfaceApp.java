package egoing.oop;

interface Calculable {
    double PI = 3.14; // 변수를 정의할 때는 내용을 적음
    int sum(int v1, int v2);
}

interface Printable {
    void print();
}

class RealCal implements Calculable, Printable {
    public int sum(int v1, int v2) {
        return 0;
    }

    public void print() {
        System.out.println("This is RealCal!");
    }
}

class DummyCal implements  Calculable {
    public int sum(int v1, int v2) {
        return 3;
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Calculable c = new RealCal();
        System.out.println(c.sum(2, 1));
        System.out.println(c.PI);
    }
}
