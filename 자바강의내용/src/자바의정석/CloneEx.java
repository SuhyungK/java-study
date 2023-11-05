package 자바의정석;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = arr;
        int[] arrClone = arr.clone();
        int[] arrClone2 = new int[5];
        System.arraycopy(arr, 0, arrClone2, 0, arr.length);

        ArrayList list = new ArrayList();
        ArrayList list2 = (ArrayList) list.clone();

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arrClone);
        System.out.println(arrClone2);

    }
}
