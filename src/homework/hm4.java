package homework;

import java.util.Scanner;

public class hm4 {
    public static void main(String[] args) {
        //1 araba 100km de 9 litre benzin yakıyor. 1 Litre
        // benzin 1.4 euro dur. Kullanıcıdan konsola kaç Euro luv
        // benzin alacagini isteyiniz ve onunla kaç km gidebileceğini
        // hesaplayarak konsola yazdiriniz.


        int benzin;
        Scanner kac_km = new Scanner(System.in);
        System.out.print("Kac Euroluk Benzin Aldiniz.....>");
        benzin = kac_km.nextInt();
        double sonuc = (9.0 / 100.0);
        double sonuc_1 = (sonuc * 1.4);
        double yakit = (benzin / sonuc_1);
        System.out.println("Arabaniz " + benzin + " Euroluk Benzinle : " + yakit + "  km gider");
    }
}
