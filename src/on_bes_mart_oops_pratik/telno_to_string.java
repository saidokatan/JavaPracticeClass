package on_bes_mart_oops_pratik;

import java.util.Scanner;

public class telno_to_string {
    public static void main(String[] args) {
        Scanner tel_no = new Scanner(System.in);
        System.out.println("telefon numaranızı giriniz :");
        String telefon_no = tel_no.next();
        String Rakamlar[] = {"Sıfır", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi",
                "Sekiz", "Dokuz"};
        String[] ayrılmış;
        ayrılmış = telefon_no.split("");
        for (int i = 0; i < ayrılmış.length; i++) {
            for (int j = 0; j < Rakamlar.length; j++) {
                if (j == (Integer.parseInt(ayrılmış[i]))) {
                    System.out.print(Rakamlar[j] + " ");
                }
            }
        }
    }
}
