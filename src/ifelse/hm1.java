package ifelse;

import java.util.Scanner;

public class hm1 {
    public static void main(String[] args) {
        int kenar_1, kenar_2, kenar_3;
        Scanner sonuc = new Scanner(System.in);
        System.out.print("Birinci Kenari Giriniz...>  ");
        kenar_1 = sonuc.nextInt();
        System.out.print("Ikinic Kenari Giriniz...>  ");
        kenar_2 = sonuc.nextInt();
        System.out.print("Ucuncu Kenari Giriniz...>  ");
        kenar_3 = sonuc.nextInt();

        if (kenar_1 == kenar_2 && kenar_1 == kenar_3 && kenar_2 == kenar_3) {

            System.out.println("Eskenar Ucgen..>");
        } else {
            System.out.println("Eskenar Ucgen degildir..>");

        }

    }
}
