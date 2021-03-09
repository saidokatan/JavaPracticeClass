package sekiz_mart_pratik;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Grileni_tesrten_yazma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print(" Bir Isim Giriniz..> ");
        String isim = girdi.next();
        ArrayList isim_dizi = new ArrayList();
        isim_dizi.add(isim);
        for (int i = isim_dizi.size()-1; i >0; i--) {

            System.out.print(isim_dizi.get(i));

        }

    }
}
