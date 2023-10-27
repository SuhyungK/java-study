package egoing.제어문;

public class LogicalOperatorApp {
    public static void main(String[] args) {
        System.out.println(1 == 1);

        // && : 둘 다 true일 경우 true (AND 연산자)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // || : 둘 중 하나가 true일 때 true (OR 연산자)
        System.out.println(true && true); // true
        System.out.println(true && false); // true
        System.out.println(false && true); // true
        System.out.println(false && false); // false

        // not
        System.out.println(!true); // false
    }
}
