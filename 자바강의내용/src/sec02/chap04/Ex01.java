package sec02.chap04;

public class Ex01 {
    public static void main(String[] args) {


        //  float은 뒤에 f 또는 F를 붙여 표현
        float flt1 = 3.14f;
        double dbl1 = 3.14;

        //  ⚠️ float에는 double을 담을 수 없음
        float flt2 = (float) dbl1;
        //  반대는 가능
        double dbl2 = flt1;

        long ln1 = 123;

        // 정수 대입할 때는 묵시적 변환
        float flt3 = ln1;
        double dbl3 = ln1;

        long ln2 = Long.MAX_VALUE;

        // 큰 수(표현 가능한 한도를 넘어서는 수)일 경우
        // 아주 정확하게 표현하기는 어려움
        float flt4 = ln2;
        double dbl4 = ln2;
    }
}
