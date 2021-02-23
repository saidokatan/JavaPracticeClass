package day01;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        // patron çalışanlarına zam yapıyor %20 oranında,
        // eski maaşını giren çalışanın yeni massını gösteren program yazınız

        int maas;
        Scanner iscimaasi=new Scanner(System.in);
        System.out.print("Maasinizi Giriniz...>");
        maas=iscimaasi.nextInt();
        System.out.println("yeni maasiniz...>" + ((maas)+((maas)*20)/100));

    }
}
