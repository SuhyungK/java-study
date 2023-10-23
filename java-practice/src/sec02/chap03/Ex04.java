package sec02.chap03;

public class Ex04 {
    public static void main(String[] args) {


        int a = 1;
        int b = 2;

        // int끼리 연산은 int 반환
        int c = a+b;
        long d = a+b;
    //    short e = a+b; 묵시적으로는 불가
        short f = (short)(a+b); // 명시적으로만 가능, 괄호를 제거하면 a만 형변환 됨


        // byte와 short의 연산은 int값을 반환한다
        // int는 4바이트, 32비트로 CPU에서 처리하기에 가장 적합한 크기
        // 자바의 기본 자료형

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

    //    byte b3 = b1+b2; 이런건 불가능
        int i1 = b1+b2;

        // long 끼리의 연산은 long 반환
        long l1 = 1;
        long l2 = 2;

        long l3 = l1+l2;

        // 정수 자료형은 소수점 아래를 '버림'
        byte int1 = 5/2; // 2;
    }

}
