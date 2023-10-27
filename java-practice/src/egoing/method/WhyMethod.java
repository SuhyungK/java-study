package egoing.method;

public class WhyMethod {
    public static void main(String[] args) {
        printTwoTimes("a", "-");
        printTwoTimes("b", "*");
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");
    }

    private static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
