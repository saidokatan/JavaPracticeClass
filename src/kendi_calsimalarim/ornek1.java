package kendi_calsimalarim;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ornek1 {
    public static void main(String[] args) {
        Integer[] num1 = {12, 23, 34, 5, 6, 7, 34, 67, 89, 89, 6, 5, 43, 435, 56, 67, 9, 0, 956, 3};
        Arrays.sort(num1, Collections.reverseOrder());

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
//Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.printf("Modified arr[] : %s",
//                          Arrays.toString(arr));