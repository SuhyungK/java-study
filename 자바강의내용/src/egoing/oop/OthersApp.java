package egoing.oop;

import java.io.FileWriter;
import java.io.IOException;

public class OthersApp {
    public static void main(String[] args) throws IOException {

        // 일회용으로 사용할 수 있는 경우 -> 클래스 변수
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        // 맥락이 긴 작업인 경우 -> 클래스를 복제해서 인스턴스 만들어서 사용
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.close();
    }
}
