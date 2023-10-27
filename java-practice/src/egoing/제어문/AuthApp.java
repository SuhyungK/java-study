package egoing.제어문;

public class AuthApp {
    public static void main(String[] args) {
        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

        // 논리 연산자 && 사용
        // 둘 다 참이면 -> true
        if (inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
