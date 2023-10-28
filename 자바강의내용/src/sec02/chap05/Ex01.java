package sec02.chap05;

public class Ex01 {
    public static void main(String[] args) {
        // 문자열의 메소드
        // 자바의 문자열은 불변
        // 다른 값을 넣을 수 없다(X) 새 문자를 만들어서 반환하는 것 (O)

        // 1. 문자열 길이 반환
        int int1 = "".length();
        int int2 = "안녕하세요".length();
        String str = "Hello World";
        int int3 = str.length();

        // 2. 빈 문자열 여부
        String str2 = " \t\n"; // length: 3

        // isEmpty : 문자열 길이가 0인가
        boolean bool1 = str.isEmpty(); // true
        boolean bool2 = str2.isEmpty(); // false

        // isBlank : 공백을 제외한 문자열의 길이가 0인가
        boolean bool3 = str.isBlank(); // true
        boolean bool4 = str.isBlank(); // true

        // 3. 트리밍
        // 양 옆 공백 제거
        String str3 = "\t 에 네 르 기 파 \n:";
        String str4 = str3.trim(); // 에 네 르 기 파

        // 변수 그 자체에 적용하기
        str3 = str3.trim();
    }
}
