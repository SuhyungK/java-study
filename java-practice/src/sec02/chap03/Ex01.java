package sec02.chap03;

public class Ex01 {
    public static void main(String[] args) {

        //  참/거짓 - boolean
        System.out.println(true);
        System.out.println(false);

        //  숫자
        System.out.println(123); // int
        System.out.println(3.14); // double

        //  문자 - char
        System.out.println('A');
        System.out.println('가');
        System.out.println('⭐');

        //  문자열 - String
        System.out.println("자료형 공부하기");

        // 문자열 붙이기
        System.out.println("원주율 : " + 3.14);

        // 변수 : 공통된 값

        double pi = 3.14;
        System.out.println("원주율 : " + pi);
        System.out.println("원의 둘레 : 지름 X " + pi);

        // 변수 값 변경하기
        pi = 3.14159;
        System.out.println("원주율 : " + pi);

        int age;
//        System.out.println(age);

        age = 21;
        System.out.println(age);

        // 대입(할당) 연산자
        String 대학 = "학생";
        System.out.println(대학);

        // 일반적으로 아래와 같이 선언과 초기화를 동시에 진행
        boolean isMarried = false;
        double height = 179.99;
        char sex = 'm';

        // 디버깅 단축키 : ctrl + shift + D

        // 변수 : 값이 변경될 수 있음
        age = 22;

        // 자바는 정적 자료형
        // 다른 자료형으로 변경할 수 없음
        // age = false; (X)

        // 한 줄에 여러 변수 선언
        char ch1, ch2, ch3;
        char ch4; char ch5;

        char ch6 = 'M';

        // 변수의 값을 다른 변수에 넣을 수 있음
        int numberA = 1;

        int numberB = numberA;
        numberA = 2;

        // numberA = 2, numberB = 1
        // 원시타입 데이터는 값을 복사해서 넘겨줌

        // 상수
        // final : 상수, 한 번만 값을 초기화할 수 있음(변경 불가)
        final int INT_NUM = 1;
        // INT_NUM = 2;
    }
}
