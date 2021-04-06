package prarik_29_mart;

import java.sql.SQLOutput;
import java.util.Scanner;

public class alinan_rakami_yazi {
    public static final String[] birlikBasamakliSayilar = {"", "bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
    public static final String[] ikiBasamakliSayilar = {"","On", "Yirmi", "Otuz", "Kirk", "Elli", "Altmis", "Yetmis", "Seksen", "Doksan"};

    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("1 ile 100 arasinda bir sayi giriniz....> ");
        int girilenSayi = sayi.nextInt();
        yaziyaCevir(girilenSayi);
    }

    public static void yaziyaCevir(int n) {
        int birler = n % 10;
        int onlar = (n - birler) / 10;
        System.out.println(ikiBasamakliSayilar[onlar] +birlikBasamakliSayilar[birler] );
    }
}
