package sec02.chap03;

public class Ex03 {
    public static void main(String[] args) {
        // 이항 연산자
        // 좌우의 두 값을 계산한 뒤 결과를 반환
        // A가 Bㄹ르 반환한다는 것은 A를 B로 바꿔쓸 수 있다
        // 부수적 효과는 없음

        int a = 1+2;
        int b = a-1;
        int c = b*a;
        int d = a+b*c/3;
        int e = (a+b)*c/3;
        int f = e%4;
    }
}
