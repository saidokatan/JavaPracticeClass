package array_list_odevler_3_hafta;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_aynimi {
    public static void main(String[] args) {
        ArrayList<Integer> array_1 = new ArrayList<>();
        ArrayList<Integer> array_2 = new ArrayList<>();
        array_1.add(10);
        array_1.add(8);
        array_1.add(3);
        array_1.add(4);
        array_1.add(7);
        array_2.add(10);
        array_2.add(8);
        array_2.add(3);
        array_2.add(1);
        array_2.add(7);
        boolean esitmi = array_1.equals(array_2);
        if (esitmi) {
            System.out.println("esit");
        } else {
            System.out.println("degil");
        }
        System.out.println(array_1.equals(array_2));
    }
}



