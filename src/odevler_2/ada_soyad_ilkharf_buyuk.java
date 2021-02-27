package odevler_2;

import java.util.Locale;
import java.util.Scanner;

public class ada_soyad_ilkharf_buyuk {
    public static void main(String[] args) {
        String adi, soyadi;
        Scanner ilkharflerbuyuk = new Scanner(System.in);
        System.out.print("Adinizi Giriniz...>  ");
        adi = ilkharflerbuyuk.next();
        System.out.print("Soy Adinizi Giriniz...>  ");
        soyadi = ilkharflerbuyuk.next();
        String trim_adi = adi.trim();
        String trim_soyadi = soyadi.trim();
        int adi_uzunluk = trim_adi.length();
        int soyadi_uzunluk = trim_soyadi.length();
        for (int i = 0; i < adi_uzunluk; i++) {
            if (0 == i) {
                char c = trim_adi.charAt(0);
                char c1 = Character.toUpperCase(c);
                System.out.print(c1);
            } else {
                char c = trim_adi.charAt(i);
                System.out.print(c);
            }
        }
        System.out.println();

        for (int i = 0; i < soyadi_uzunluk; i++) {
            if (0 == i) {
                char c = trim_soyadi.charAt(0);
                char c1 = Character.toUpperCase(c);
                System.out.print(c1);
            } else {
                char c = trim_soyadi.charAt(i);

                System.out.print(c);
            }
        }
    }
}
