package for_each_loop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class toplamini_bulma {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int sum = 0;
        for (Integer sayi : list2) {
            sum += sayi;

        }
        System.out.println(sum);
    }
}