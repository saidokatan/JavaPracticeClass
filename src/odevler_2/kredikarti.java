package odevler_2;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.function.LongToIntFunction;

public class kredikarti {
    public static void main(String[] args) {
        long kredi_karti_nosu;
        Scanner kkno = new Scanner(System.in);
        System.out.print(" Kredi Karti Numaranizi Giriniz  >>   ");
        kredi_karti_nosu = kkno.nextLong();
        String st_yeni_no = String.valueOf(kredi_karti_nosu);
        String trim_kkno = st_yeni_no.trim();
        int kk_uzunluk = 0;
        kk_uzunluk = trim_kkno.length();
        System.out.println(kk_uzunluk + " Haneli Bir Kredi Karti Numarasi Girdiniz");
        char ucuncu_karakter = trim_kkno.charAt(2);
        char dorduncu_karakter = trim_kkno.charAt(3);
        long son_rakam;
        son_rakam = Integer.parseInt(trim_kkno);
        long sonuncu_rakam = son_rakam % 10;
        System.out.println("Kredi Kartiniznin Ucuncu Rakami..>" + ucuncu_karakter);
        System.out.println("Kredi Kartiniznin Ucuncu Rakami..>" + dorduncu_karakter);
        System.out.println("Kredi Kartiniznin Ucuncu Rakami..>" + sonuncu_rakam);
    }

}
