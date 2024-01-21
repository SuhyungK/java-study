package 자바의정석.ch06;

public class Tv {
    // 속성, 멤버 변수
    String color;
    boolean power;
    int channel;

    // 기능, 메서드
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}