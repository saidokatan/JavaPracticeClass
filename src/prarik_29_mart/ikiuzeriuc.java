package prarik_29_mart;

import java.util.Scanner;

public class ikiuzeriuc {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.print("Hangi Sayinin Kuvvetini Almak Istiyorsunuz..>");
        int taban = sayi.nextInt();
        System.out.print( taban + " sayisinin kacinic Kuvvetini Almak Istiyorsunuz..>");
        int kuvvet = sayi.nextInt();
        int result = 1;
        for (int i = 0; i < kuvvet; i++) {
            result *= taban;
        }
        System.out.println(taban + " Sayisini " + kuvvet+ ".cu kuvveti " + result);
    }
}