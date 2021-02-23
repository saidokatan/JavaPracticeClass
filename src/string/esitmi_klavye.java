package string;

import java.util.Locale;
import java.util.Scanner;

public class esitmi_klavye {
    public static void main(String[] args) {
        String girilen_isim, girilen_isim_2;

        Scanner esitlik = new Scanner(System.in);
        System.out.print("Bir yazi giriniz     ");
        girilen_isim = esitlik.next();
        System.out.print("Bir yazi giriniz     ");
        girilen_isim_2 = esitlik.next();
        boolean esit_mi=girilen_isim.toLowerCase(Locale.ROOT).equals(girilen_isim_2.toLowerCase(Locale.ROOT));
        if (esit_mi) {
            System.out.print("Isimler esit     ");
        }
        else {
            System.out.print("esit degil     ");
        }
    }
}
