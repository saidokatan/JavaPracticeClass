package odevler_2;

import java.util.Scanner;

public class adsoyad_uzunluk {
    public static void main(String[] args) {
        String adi, soyadi;
        Scanner uzunluk = new Scanner(System.in);
        System.out.print("Adinizi Giriniz...>  ");
        adi=uzunluk.next();
        System.out.print("Soy Adinizi Giriniz...>  ");
        soyadi=uzunluk.next();
        String trim_adi=adi.trim();
        String trim_siyadi=soyadi.trim();
        int adi_uzunluk= trim_adi.length();
        int soyadi_uzunluk=trim_siyadi.length();
        System.out.println("Adinizin uzunlugu...."+ adi_uzunluk);
        System.out.println("Soyadinizin uzunlugu...."+ soyadi_uzunluk);

    }
}
