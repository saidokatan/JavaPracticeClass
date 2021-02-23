package string;

import java.util.Locale;

public class icerir {
    public static void main(String[] args) {
        String elma = "Elma";
        String armut = "Armut";
        String ceviz = "Ceviz";
        boolean elma_icerir = elma.toLowerCase(Locale.ROOT).contains("a");
        boolean armut_icerir = armut.toLowerCase(Locale.ROOT).contains("a");
        boolean ceviz_icerir = ceviz.toLowerCase(Locale.ROOT).contains("a");
        String sonuc_1 = (elma_icerir == true) ? "Elma da a vardir" : "Elmada a yoktur.";
        String sonuc_2 = (armut_icerir == true) ? "Armutta da a vardir" : "Armut ta a yoktur.";
        String sonuc_3 = (ceviz_icerir == true) ? "Cevizde da a vardir" : "Ceviz de a yoktur.";

        /*System.out.println(elma + " a harfi icerir  " + elma_icerir);
        System.out.println(armut + " a harfi icerir  " + armut_icerir);
        System.out.println(ceviz + " a harfi icerir  " + ceviz_icerir);
        */

        System.out.println(elma + "  <<>>  " + sonuc_1);
        System.out.println(armut + "  <<>>  " + sonuc_2);
        System.out.println(ceviz + "  <<>>   " + sonuc_3);
    }
}
