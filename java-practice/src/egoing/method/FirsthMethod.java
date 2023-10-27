package egoing.method;

public class test {
    public static void main(String[] args) {
        // 메서드 = 함수
        // 복잡한 걸 정리 해서 단순 하게 만드는 정리 정돈 도구...?
        // 서로 연관된 코드를 모아서 이름을 붙인 걸 메서드라고 함
        // 이미 만들어둔 메서드를 사용하는 걸로 똑같은 코드를 다시 사용

        String a = "aBcDeFg";
        String answer = "";

        for (Character c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
                continue;
            }
            answer += String.valueOf(c).toUpperCase();
        }

        System.out.println(answer);
    }
}
