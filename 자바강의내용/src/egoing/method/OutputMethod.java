package egoing.method;

import java.io.FileWriter;
import java.io.IOException;

public class OutputMethod {

    public static String a() {
        return "a";
    }

    public static int one() {
        return 1;
    }

    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";

        return out;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(twoTimes("a", "-"));
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();

    }
}
