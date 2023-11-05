package 자바의정석;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        System.out.println(Arrays.toString(arr));
        String str = String.join("-", arr);
        System.out.println(str);
    }
}
