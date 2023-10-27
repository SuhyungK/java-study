package egoing.inheritance;

class Cal {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
}

class Cal3 extends Cal {
    public int sum(int v1, int v2) {
        System.out.println("르세라핌 노래 듣는 중");
        return v1 + v2;
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        Cal3 c3 = new Cal3();

        c.sum(1, 2);
        c3.sum(1, 3);
    }
}
