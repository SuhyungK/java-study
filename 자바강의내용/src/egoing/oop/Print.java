package egoing.oop;

// 서로 연관되어 있다는 것을 알기 쉬움
class Print {
    public String delimiter = "";

    public Print(String delimiter) {
        // 매개 변수로 받아오는 값을 이 클래스의 delimiter에 넘겨주기
        this.delimiter = delimiter;
    }

    public void a() {
        // 매개변수나 내부의 변수로 delimiter 가 존재하지 않기 때문에 메소드 바깥에서 찾게 됨
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void b() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
