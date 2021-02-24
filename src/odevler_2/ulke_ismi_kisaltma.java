package odevler_2;

import java.util.Locale;
import java.util.Scanner;

public class ulke_ismi_kisaltma {
    public static void main(String[] args) {
        String ulke;
        Scanner ulke_kisaltma = new Scanner(System.in);
        System.out.print("Bir Ulke  Giriniz...>  ");
        ulke = ulke_kisaltma.next();
        String trim_ulke = ulke.trim();
        boolean amerika=trim_ulke.equals("Amerika");
        boolean england=trim_ulke.equals("Ingiltere");
        boolean almanya=trim_ulke.equals("Almanya");

        if (amerika)  {
            System.out.println("Welcome to USA");
        } else if (england) {
            System.out.println("Welcome to UK");
        } else if(almanya) {
            System.out.println("Welcome to DE");
        }
        else {
            System.out.println("Yanlis NA");
        }

}
}
