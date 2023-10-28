package egoing.제어문;

public class LoopApp {
    public static void main(String[] args) {
        System.out.println(1);

        int i = 0;
        while (i<3) {
            System.out.println(2);
            System.out.println(3);
            i++;
        }

        // 반복의 횟수가 정해져있을 때는 for문이 더 유용
        for (int j = 0; j<3; j++) {
            System.out.println(2);
            System.out.println(3);
        }
        System.out.println(4);
    }
}
