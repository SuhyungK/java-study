package egoing.method;

class Print {
    public String delimiter;

    public void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
    }

    // 메소드의 소속이기 때문에 static
    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        // 메소드가 클래스 소속일 때는 static ⭕️
        // Print.a();

        // instance
        Print t1 = new Print();
        t1.delimiter = "-";
        // 메소드가 인스턴스의 소속일 때는 static ❌
        t1.a();
        t1.b();

        Print.c("-");
    }
}
