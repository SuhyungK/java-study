package egoing.제어문;

public class ArrayApp {
    public static void main(String[] args) {
//        String users = "eoging, jinhuck, youbin";
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";

        System.out.println(users[1]);
        System.out.println(users.length); // 3칸 짜리 배열 이다

        // 배열 선언 + 초기화 동시
//        int[] scores = new int[3];
        int[] scores = {10, 100, 1000};
        System.out.println(scores[1]);

    }
}
