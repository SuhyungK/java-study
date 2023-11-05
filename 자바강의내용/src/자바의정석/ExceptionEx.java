package 자바의정석;

import java.io.File;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = "실험";
        name.toString();
    }

}
