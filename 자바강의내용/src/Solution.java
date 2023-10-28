import java.util.Objects;

class Solution {

    public static void main(String[] args) {

//        System.out.println(solution("<", "=", 20, 5));
//        System.out.println(solution("<", "=", 2, 1));
        System.out.println(solution("<", "=", 100, 1));
//        System.out.println(solution("<", "=", 5, 5));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        String tmp = ineq + eq;
        switch (tmp) {
            case ">=": if (n >= m) { return 1; };
            case "<=":
                if (n <= m) {
                    System.out.println(n <= m);
                    return 1;
                };
            case ">!":
                if (n > m) {
                    System.out.println("3");
                    return 1;
                };
            case "<!": if (n < m) { return 1; };
            default: return 0;
        }
    }
}
