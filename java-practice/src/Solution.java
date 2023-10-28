package egoing.oop;

import java.util.Objects;

class Solution {

    public static void main(String[] args) {

        System.out.println(solution("<", "=", 20, 5));
        System.out.println(solution(">", "!", 40, 58));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        String tmp = ineq + eq;
        switch (tmp) {
            case "<=": if (n <= m) { return 1; };
            case ">=": if (n >= m) { return 1; };
            case "<!": if (n < m) { return 1; };
            case ">!": if (n > m) { return 1; };
        }
        return 0;
    }
}
