package Oops_Class_obejeler;

import java.util.Scanner;

public class main_if_else {
    public static void main(String[] args) {
        //dort_islem islem = new dort_islem();
        int birinci_sayi = 0;
        int ikinci_sayi = 0;
        String isaret;
        Scanner girdi_isaret = new Scanner(System.in);
        Scanner sayi = new Scanner(System.in);
        System.out.print("Hangi Islemi Yapmak Istersiniz  + , - , / , *  --> ");
        isaret = girdi_isaret.next();
        System.out.print("Birinci Sayisi Giriniz..> ");
        birinci_sayi = sayi.nextInt();
        System.out.print("Ikinci Sayisi Giriniz...>  ");
        ikinci_sayi = sayi.nextInt();
        if (isaret.equals("+")) {
            System.out.println("Toplama Islemi Yapiyorsunuz");
            int toplam = dort_islem.toplama(birinci_sayi,ikinci_sayi);
            System.out.println("Iki Sayinin Toplami..> " + toplam);
        } else if (isaret.equals("-")) {
            System.out.println("Cikarma Islemi Yapiyorsunuz");
            int cikarma = dort_islem.cikarma(birinci_sayi, ikinci_sayi);
            System.out.println("Iki Sayinin Farki ..> " + cikarma);
        } else if (isaret.equals("*")) {
            System.out.println("Carpma Islemi Yapiyorsunuz");
            int carpma = dort_islem.carpma(birinci_sayi, ikinci_sayi);
            System.out.println("Iki Sayinin Farki ..> " + carpma);
        } else if (isaret.equals("/")) {
            System.out.println("Bolme Islemi Yapiyorsunuz");
            float bolme = dort_islem.bolme(birinci_sayi, ikinci_sayi);
            System.out.println("Iki Sayinin Farki ..> " + bolme);
        } else {
            System.out.println("Yanlis Deger Girdiniz..");
        }
    }
}
