package odevler_2;

import java.util.Scanner;

public class ulke_bastan_iki_sondan_iki {
    public static void main(String[] args) {
        String ulke;
        Scanner u_girdi = new Scanner(System.in);
        System.out.print("Yasadiginiz Ulkeyi Griniz...>   ");
        ulke = u_girdi.next();
        String t_ulke = ulke.trim();
        int uzunluk_ulke = t_ulke.length();
        for (int i = 0; i <= uzunluk_ulke; i++) {
            if (1 == i) {
                System.out.print(t_ulke.charAt(0));
                char c = t_ulke.charAt(1);
                char c1 = Character.toUpperCase(c);
                System.out.print(c1);
            }
        }
    }
}