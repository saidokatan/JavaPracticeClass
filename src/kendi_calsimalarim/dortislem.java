package kendi_calsimalarim;

import java.util.Scanner;

public class dortislem {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = girdi.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = girdi.nextInt();
        System.out.println("\nlütfen yapmak istediğiniz işlemleri seçiniz: ");
        System.out.println("1- toplama\n2- çıkarma\n3- çarpma\n4- bölme");
        System.out.print("seçiminiz: ");
        secim = girdi.nextInt();
        if (secim == 1) {
            int toplam = 0;
            toplam = sayi1 + sayi2;
            System.out.println("toplam sonuc: " + toplam);
        } else if (secim == 2) {
            int cikarma;
            cikarma = sayi1 - sayi2;
            System.out.println("çıkarma sonuç: " + cikarma);
        } else if (secim == 3) {
            int carpma;
            carpma = sayi1 * sayi2;
            System.out.println("çarpma sonucu: " + carpma);
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("ikinci sayı 0 eşittir ve sonuç belirsizdir");
            } else {
                System.out.println("bölme sonucu: " + (sayi1 / sayi2));
            }
        }
            else{
                System.out.println("geçersiz bir işlem girdiniz");
            }
        }

    }
