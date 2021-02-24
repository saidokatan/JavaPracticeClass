package odevler_2;

import java.util.Scanner;

public class ulke_ikiharf_buyuk {
    public static void main(String[] args) {
        String ulke;
        Scanner girdi_ulke = new Scanner(System.in);
        System.out.print("Ulkenizin Adini Giriniz..>   ");
        ulke = girdi_ulke.next();
        String bosluk_ulke = ulke.trim();
        int ulke_uzunluk = bosluk_ulke.length();
        for (int i = 0; i < ulke_uzunluk; i++) {
            if (0 == i) {
                char c = bosluk_ulke.charAt(0);
                char c1 = Character.toUpperCase(c);
                System.out.print(c1);
            } else if (1==i) {
                char c2 = bosluk_ulke.charAt(1);
                char c3 = Character.toUpperCase(c2);
                System.out.print(c3);
            }
            else {
                char c = bosluk_ulke.charAt(i);

                System.out.print(c);
            }
        }
    }
}