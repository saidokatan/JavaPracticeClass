package proje_odevleri;

import java.util.Random;
import java.util.Scanner;

public class randomsayi {
    public static void main(String[] args) {
        int girilenSayi;
        Random r = new Random();
        int random = r.nextInt(100);
        Scanner sayi = new Scanner(System.in);
        System.out.println(random);
        System.out.println("*** Bu bir sayi tahmin oyunudur *** ");
        System.out.println("*** Bilgisayar 1 - 100 arasinda bir sayi tuttu *** ");
        //System.out.println("*** Bu Sayiyi Bilmeniz icin 5 tahmin hakkiniz vardir. *** ");
        int girilenSayi1 = 0;
        int i = 1;
        while (random != girilenSayi1) {
            System.out.print("Lufen Bir tahmin giriniz....> ");
            girilenSayi = sayi.nextInt();
            if (girilenSayi > random) {
                System.out.println("** Daha Kucuk Bir Sayi Girmelisiniz **");
                girilenSayi1 = girilenSayi;
            } else if (girilenSayi < random) {
                System.out.println(" **Daha Buyuk Bir Sayi Girmelisiniz**");
                girilenSayi1 = girilenSayi;
            } else break;
            i++;
        }
        System.out.println(" Tebrikler " + i + " Denemede sayiyi Bildiniz ");
    }
}

