package sec02.chap03;

public class Ex05 {
    public static void main(String[] args) {
        // 복합 대입 연산자로 "부수적 효과"

        int a = 1;
        a = a + 2;
        a += 3;

        // 값을 반환하는 것도 가능
        int b = a += 4;
    }
}
