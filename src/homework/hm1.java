package homework;

import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner bs = new Scanner(System.in);
        Scanner iks = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Griniz..>");
        a = bs.nextInt();
        System.out.print("Ikinci Sayiyi Griniz..>");
        b = iks.nextInt();
        c = a % b;
        System.out.println("Kalan...>" + c);

    }
}
