package ifelse;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int a, b, c, enbuyuk, enkucuk, sonuc;
        Scanner say = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz   >>>");
        a = say.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz..>");
        b = say.nextInt();
        System.out.print("ucuncu sayiyi Sayiyi Giriniz..>");
        c = say.nextInt();
        if (a > b && a > c) {
            enbuyuk = a;
        } else if (b > c) {
            enbuyuk = b;
        } else {
            enbuyuk = c;
        }
        if (a < b && a < c) {
            enkucuk = a;
        } else if (b < c) {
            enkucuk = b;
        } else {
            enkucuk = c;
        }
        System.out.println(+enbuyuk -enkucuk);
    }

}





