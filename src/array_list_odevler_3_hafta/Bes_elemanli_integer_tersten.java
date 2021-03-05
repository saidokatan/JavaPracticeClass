package array_list_odevler_3_hafta;

import java.util.ArrayList;

public class Bes_elemanli_integer_tersten {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        int uzunluk = list.size();
        System.out.println(uzunluk);
        //once duzgun yazdiralim.
        for (int i = 0; i < uzunluk; i++) {
            System.out.println((i + 1) + ". dizi elemani " + list.get(i));
        }
        System.out.println();
        //Simdi Tersten Yazdiralim
        for (int i = uzunluk - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". dizi elemani " + list.get(i));
        }
    }
}
