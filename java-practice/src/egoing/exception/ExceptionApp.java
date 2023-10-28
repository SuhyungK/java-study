package egoing.exception;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);

        int[] scores = {10, 20, 30};

        try {
            System.out.println(2 / 0);
            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println("뭔가 이상함. 오류가 발생함... " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(5);
    }
}
