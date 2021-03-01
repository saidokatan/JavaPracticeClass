package Praktice_3_hafta;

import java.util.Arrays;

public class array_siralama {
    public static void main(String[] args) {
        String[] string_dizi = {"d", "j", "t", "Adana", "kayseri", "kayisi", "z", "yu"};
        int[] int_dizi = {2, 5, 66, 87, 98, 43, 21};
        Arrays.sort(string_dizi);
        Arrays.sort(int_dizi);
        for (int i = 0; i < string_dizi.length; i++) {
            System.out.println("Sirasi  > " + string_dizi[i]);
        }
        System.out.println();
        for (int i = 0; i < int_dizi.length; i++) {
            System.out.println("Sirasi  > " + int_dizi[i]);
        }
    }
    }

