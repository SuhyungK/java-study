package 자바의정석;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(str1.toString());

        String str2 = new String("abc");
        System.out.println(str2.toString());

        String str3 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals((str2)));
        System.out.println(str1 == str3);

        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println(s);
    }
}
