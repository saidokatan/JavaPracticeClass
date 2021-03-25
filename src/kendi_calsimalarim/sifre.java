package kendi_calsimalarim;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
         /*bir dizenin geçerli bir parola olup olmadığını kontrol etmek için bir java method yazın.
        şifre kuralları:
        -Bir şifre en az on karakterden oluşmalıdır.
        -Bir şifre sadece harf ve rakamlardan oluşur.
        -Bir şifre en az iki rakam içermelidir.
        */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int sonuc = 0;
        do {
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scan.nextLine();
            sonuc = uzunluk(sifre) + harfVarMi(sifre) + sayiVarmi(sifre);
        } while (sonuc != 3);
        System.out.println("Sifreniz basari ile kaydedildi");
    }
    public static int uzunluk(String sifre) {
        int flagUzunluk = 0;
        int index = 0;
        if (sifre.length() - 1 > 10) {
            flagUzunluk = 1;
        } else {
            System.out.println("şifre 10 karakterden azdır");
        }
        return flagUzunluk;
    }
    public static int harfVarMi(String sifre) {
        int flagHarf = 0;
        int index = 0;
        while (index < sifre.length()) {
            if (sifre.charAt(index) >= 'A' && sifre.charAt(index) <= 'Z' ||
                    sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z') {
                flagHarf = 1;
            }
            index++;
        }
        if (flagHarf == 0) {
            System.out.println("sifre harf icermelidir");
        }
        return flagHarf;
    }
    public static int sayiVarmi(String sifre) {
        int flagSayi = 0;
        int index = 0;
        int say = 0;
        while (index < sifre.length()) {
            if (sifre.charAt(index) >= '0' && sifre.charAt(index) <= '9') {
                say++;
            }
            index++;
        }
        if (say >= 2) {
            flagSayi = 1;
        }
        if (flagSayi == 0) {
            System.out.println("sifre en az iki sayi icermelidir");
        }
        return flagSayi;
    }
    }

