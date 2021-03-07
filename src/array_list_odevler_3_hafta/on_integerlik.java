package array_list_odevler_3_hafta;

import java.util.ArrayList;
import java.util.Collections;

public class on_integerlik {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        // Arraylere deger atama
        list3.add(3);
        list3.add(21);
        list3.add(34);
        list3.add(23);
        list3.add(45);
        list3.add(54);
        list3.add(1);
        list3.add(99);
        list3.add(125);
        list3.add(114);
        // 2 inci ve 7 inci elemanin degerini degitirdik
        list3.set(1, 10);
        list3.set(6, 20);
        // ilk ve son elemani sildik
        list3.remove(9);
        list3.remove(0);
        // listeliyoruz duruma bakiyoruz
        System.out.println(list3);
        // kucukten buyuge siralama
        Collections.sort(list3);
        //Yazdiralim
        System.out.println(list3);
        //Tersten Yazdiralim
        int size = list3.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list3.get(i) + " ,");
        }
        System.out.println();
        //list3 un icinde 8 sayisi var mi
        boolean sekiz_varmi = list3.contains(8);
        if (sekiz_varmi) {
            System.out.println("List_3 Sekiz icerir");
        } else{
            System.out.println("List_3 Sekiz icermez");
        }

    }
}

