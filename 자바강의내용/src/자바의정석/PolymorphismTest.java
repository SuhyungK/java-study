package 자바의정석;

public class PolymorphismTest {

    public static void main(String[] args) {
        Tv t = new CaptionTv();
        CaptionTv c = new CaptionTv();

    }
}

class Tv {
    boolean power;
    int channel;

    void power() {};
    void channelUp() {};
    void channelDown() {};
}

class CaptionTv extends Tv {
    String text;

    void caption() {};
}