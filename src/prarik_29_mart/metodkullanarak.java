package prarik_29_mart;

import java.util.Scanner;

public class metodkullanarak {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Hangi Sayinin Kuvvetini Almak Istiyorsunuz..> ");
        int taban = sayi.nextInt();
        System.out.print( taban + " sayisinin kacinic Kuvvetini Almak Istiyorsunuz..> ");
        int kuvvet = sayi.nextInt();

        System.out.println(kuvvet(taban, kuvvet));

    }
    static int kuvvet(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

}
