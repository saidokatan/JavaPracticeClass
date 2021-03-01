package Praktice_3_hafta;

import java.util.Scanner;

public class asalmi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı gir kontrol edelim asal mı ? ");
        int sayi = giris.nextInt();
        boolean asalmi = true;
        for (int i=2; i<sayi; i++) {
            if(sayi % i == 0 ) {
                asalmi = false;
            }
        }
        System.out.println(sayi + " asal mı = " + asalmi);
    }
}
