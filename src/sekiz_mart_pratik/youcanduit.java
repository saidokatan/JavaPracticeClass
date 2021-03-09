package sekiz_mart_pratik;

import java.util.Scanner;

public class youcanduit {
    public static void main(String[] args) {
        Scanner isim = new Scanner(System.in);
        String unlem = "You Can Do It !";
        System.out.print("Isminizi  Giriniz..> ");
        String you_can = isim.next();
        System.out.println();
        String sonuc = unlem.replace("!", you_can);
        System.out.println(sonuc);

    }
}

