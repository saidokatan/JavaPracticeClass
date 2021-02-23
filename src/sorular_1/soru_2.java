package sorular_1;

import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        int bas, bit;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Baslangic Sayini Giriniz");
        bas = girdi.nextInt();
        System.out.print("Bitis Sayini Giriniz");
        bit = girdi.nextInt();
        for (int i = bas; i <= bit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

    }
}
