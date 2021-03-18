package oop_odev_mathUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner secenek = new Scanner(System.in);

        System.out.println("Bu Program");
        System.out.println("Girilen Sayinin Karesini Alir............> 1 ");
        System.out.println("Girilen Sayiyi Bes ile Carpar............> 2 ");
        System.out.println("Girilen Uc Sayinin Toplamini Bulur.......> 3 ");
        System.out.print("Yapmak Istediginiz Islemi Seciniz.1/2/3..>  ");

        int secenek_gir = secenek.nextInt();
        Scanner sayi = new Scanner(System.in);
        Scanner sayi1 = new Scanner(System.in);


        switch (secenek_gir) {
            case (1):
                System.out.print("Karesini Almak Istediginiz Sayiyi Griniz..> ");
                int sayi_gir_kare = sayi.nextInt();
                System.out.println(sayi_gir_kare + " Sayisinin Karesi...> " + mathUtils.sayininKaresi(sayi_gir_kare));
                break;
            case (2):
                System.out.print("Bes Ile Carpak Istediginiz Sayiyi Giriniz..> ");
                int sayi_gir_bes = sayi.nextInt();
                System.out.println(sayi_gir_bes + " Sayisinin 5 bile carpiminda sonuc..> "
                        + mathUtils.sayiyiBesleCarp(sayi_gir_bes));
                break;
            case (3):
                System.out.println("Uc Sayinin Toplamini Yapiyorsunuz..");
                System.out.print("Birinci Sayiyi Giriniz...> ");
                int sayi_bir = sayi1.nextInt();
                System.out.print("Ikinci Sayiyi Giriniz....> ");
                int sayi_iki = sayi1.nextInt();
                System.out.print("Ucuncu Sayiyi Giriniz....> ");
                int sayi_uc = sayi1.nextInt();
                System.out.println(sayi_bir + " + " + sayi_iki + " + " + sayi_uc + " Sayilarinin Toplami  > " +
                        mathUtils.ucSayininToplami(sayi_bir, sayi_iki, sayi_uc));
                break;
            default:
                System.out.println("Yanlis Deger Girdiniz");
        }
    }
}
