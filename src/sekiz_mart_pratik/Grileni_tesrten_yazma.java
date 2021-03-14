package sekiz_mart_pratik;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Grileni_tesrten_yazma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print(" Bir Isim Giriniz..> ");
        String test_girdi = girdi.next().toUpperCase(Locale.ROOT);
        String[] girdi_dizi = test_girdi.split("");
        System.out.println("Eski hali..> " + test_girdi);
        System.out.print("Tersten Bak..> ");
        for (int i = girdi_dizi.length - 1; i >= 0; i--) {
            System.out.print(girdi_dizi[i]);
        }


    }

}
