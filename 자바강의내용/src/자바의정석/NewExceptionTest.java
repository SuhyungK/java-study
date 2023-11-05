package 자바의정석;


class Test1 {

}

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 처리했습니다. ");
        }

        Test1 t = new Test1();
        System.out.println(t.toString());
    }

    static int method1() throws Exception{
        try {
            System.out.println("method1 메서드가 호출되었습니다. ");
            return 0;
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            return 1;
        } finally {
            System.out.println("finally");
        }
    }
}
