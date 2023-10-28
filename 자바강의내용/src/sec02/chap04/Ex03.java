package sec02.chap04;

public class Ex03 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 2f;
        double dbl1 = 3;
        double dbl2 = 7;

        // 정수와 실수 자료형의 연산은 실수 값 반환
//        int flt2 = int1 / flt1;
        float flt2 = int1 / flt1;
        double dbl3 = int1 / flt1;
        double dbl4 = dbl2 / int1;

        // 리터럴로 작성시 double 임을 명시하려면 .0 붙이기
        double dbl5 = 5 / 2; // 정수 자료형은 실수에 바로 대입할 수 있음
        double dbl6 = 5.0 / 2;
        double dbl7 = (double) 5 / 2;

        float fltNum = 4.567f;
        double dblNum = 5.678;

        //  💡 정수 자료형에 실수 자료형을 강제로 넣으면 소수부를 '버림'
        int int2 = (int) fltNum;
        int int3 = (int) dblNum;

        String name = "name";
        System.out.println(5/2);
        System.out.println(5.0/2);
    }
}
