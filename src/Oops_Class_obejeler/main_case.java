package Oops_Class_obejeler;

import java.util.Scanner;

public class main_case {
    public static void main(String[] args) {
       // dort_islem islem = new dort_islem();
        int birinci_sayi = 0;
        int ikinci_sayi = 0;
        String isaret;
        Scanner girdi_isaret = new Scanner(System.in);
        Scanner sayi = new Scanner(System.in);
        System.out.print("Hangi Islemi Yapmak Istersiniz  + , - , / , *  --> ");
        isaret = girdi_isaret.next();

        switch (isaret) {

            case ("+"): {
                System.out.println("Toplama Islemi Yapiyorsunuz");
                System.out.print("Birinci Sayisi Giriniz..> ");
                birinci_sayi = sayi.nextInt();
                System.out.print("Ikinci Sayisi Giriniz...>  ");
                ikinci_sayi = sayi.nextInt();
                int toplam = dort_islem.toplama(birinci_sayi, ikinci_sayi);
                System.out.println("Iki Sayinin Toplami..> " + toplam);
                break;
            }
            case ("-"): {
                System.out.println("Cikarma Islemi Yapiyorsunuz");
                System.out.print("Birinci Sayisi Giriniz..> ");
                birinci_sayi = sayi.nextInt();
                System.out.print("Ikinci Sayisi Giriniz...>  ");
                ikinci_sayi = sayi.nextInt();
                int cikarma = dort_islem.cikarma(birinci_sayi, ikinci_sayi);
                System.out.println("Iki Sayinin Farki ..> " + cikarma);
                break;
            }
            case ("*"): {
                System.out.println("Carpma Islemi Yapiyorsunuz");
                System.out.print("Birinci Sayisi Giriniz..> ");
                birinci_sayi = sayi.nextInt();
                System.out.print("Ikinci Sayisi Giriniz...>  ");
                ikinci_sayi = sayi.nextInt();
                int carpma = dort_islem.carpma(birinci_sayi, ikinci_sayi);
                System.out.println("Iki Sayinin Farki ..> " + carpma);
                break;
            }
            case ("/"): {
                System.out.println("Bolme Islemi Yapiyorsunuz");
                System.out.print("Birinci Sayisi Giriniz..> ");
                birinci_sayi = sayi.nextInt();
                System.out.print("Ikinci Sayisi Giriniz...>  ");
                ikinci_sayi = sayi.nextInt();
                float bolme = dort_islem.bolme(birinci_sayi, ikinci_sayi);
                System.out.println("Iki Sayinin Bolumu ..> " + bolme);
                break;
            }
            default:{
                System.out.println("Yanlis Isaret Girdiniz..>");
            }
        }
    }
}
