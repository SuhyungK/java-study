package 자바의정석;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(Integer.valueOf(10));
        list1.add(new Integer(5));
        list1.add(10);
        System.out.println(list1);
    }
}
