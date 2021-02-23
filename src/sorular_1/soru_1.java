package sorular_1;

import java.util.Scanner;

public class soru_1 {
    public static void main(String[] args) {
        int bas, bit;
        Scanner tekrar = new Scanner(System.in);
        System.out.print("Baslangic Sayini Giriniz");
        bas = tekrar.nextInt();
        System.out.print("Bitis Sayini Giriniz");
        bit = tekrar.nextInt();
        for (int i = bas; i <= bit; i++) {
            System.out.print("sayi..>" + i);
        }
    }
}
