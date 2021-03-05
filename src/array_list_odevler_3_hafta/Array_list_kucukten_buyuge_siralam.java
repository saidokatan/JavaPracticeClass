package array_list_odevler_3_hafta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list_kucukten_buyuge_siralam {
    public static void main(String[] args) {
        ArrayList<Integer> int_list = new ArrayList<>();

        int_list.add(4);
        int_list.add(9);
        int_list.add(1);
        int_list.add(8);
        int_list.add(2);
        //Normal Yazilimi
        System.out.println(int_list);
        System.out.println();
        // Sirali Yazilim
        Collections.sort(int_list);
        System.out.println(int_list);


    }
}
