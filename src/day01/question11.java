package day01;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {

        //Patron çalışanlarına yaslarına göre zam yapacak
        //           40 yaş üstüne %15, altında ise %30
        //           Yas ve eski maaş bilgileri kullanıcıdan alınacak
        //           Bunu yapan program

        Scanner yasiniz = new Scanner(System.in);
        System.out.print("Yasinizi Giriniz..>");
        int yas = yasiniz.nextInt();
        System.out.print("Maasinizi Giriniz..>");
        double maas = yasiniz.nextInt();
        double yenimaas = (yas > 40) ? (maas * 1.15) : (maas * 1.3);
        System.out.println("yeni maasiniz..>" + yenimaas);


    }
}
