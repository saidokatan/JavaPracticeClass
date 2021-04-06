package prarik_29_mart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manav {
    public static List<String> urunler = new ArrayList<>();
    public static List<Double> fiyatlar = new ArrayList<>();
    public static double toplamfiyat = 0;
    public static double geriOdenecek = 0;
    public static double alinanPara = 0;
    public static void main(String[] args) {
        char Evethayır = 'e';
        urunler.add("Patates");
        fiyatlar.add(1.0);
        urunler.add("Domates");
        fiyatlar.add(1.5);
        urunler.add("Elma");
        fiyatlar.add(1.2);
        do {
            int i = 1;
            for (String w : urunler) {
                System.out.println(i + "." + w);
                i++;
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Almak istediginiz urunu kodunu giriniz: ");
            int secim = scan.nextInt();
            System.out.print("Kac kg almak istiyorsunuz: ");
            int kg = scan.nextInt();
            fiyataekle(secim - 1, kg);
            System.out.println("Cıkmak istiyor musun(e/h) ");
            Evethayır = scan.next().charAt(0);
        } while (Evethayır == 'h');
        System.out.println("Aldıgınız urunlerin toplam fiyati = " + toplamfiyat);
        int dongu = 1;
        do {
            Scanner para = new Scanner(System.in);
            System.out.print("Musteriden Alinan Para  ");
            alinanPara = para.nextDouble();
            if (alinanPara < toplamfiyat) {
                System.out.println("Odeme Yapmaniz Gereken Ucret " + toplamfiyat + "  Tl den az olamaz");
            } else {
                break;
            }
        }
        while (dongu == 1);
        System.out.println("Para Ustunuz ..> "+geriOdeme() + " Tesekkur Ederiz Yine Bekleriz");
    }

    public static void fiyataekle(int index, int kilo) {
        toplamfiyat = fiyatlar.get(index) * kilo;
    }

    public static double geriOdeme() {
        geriOdenecek = alinanPara - toplamfiyat;
        return geriOdenecek;
    }
}
