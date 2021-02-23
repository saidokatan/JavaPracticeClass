package sorular_1;

import java.util.Scanner;

public class soru_4 {
    public static void main(String[] args) {
        int bas, bit, sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Baslangic Sayini Giriniz  ");
        bas = girdi.nextInt();
        System.out.print("Bitis Sayini Giriniz  ");
        bit = girdi.nextInt();
        sayi = 0;
        for (int i = bas; i <= bit; i++) {
            sayi =sayi+ i;
        }
        System.out.println(sayi);
    }
}

