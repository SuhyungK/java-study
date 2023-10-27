package egoing.제어문;

public class IfApp {
    public static void main(String[] args) {

        // 경우에 따라 b가 출력될 때, 1이 출력될 때를 구분 하고 싶다
        System.out.println("a");

        // 하나의 if문으로 그룹핑해서 연결
//        if (true) { // false 면 출력되지 않음, true면 출력됨
//            System.out.println(1);
//        } else {
//            if (true) {
//                System.out.println(2);
//            } else {
//                System.out.println(3);
//            }
//        }
        if (true) { // false 면 출력되지 않음, true면 출력됨
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        System.out.println("b");
    }
}
