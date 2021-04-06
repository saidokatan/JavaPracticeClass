package odevler_3;

public class Utils {
    public static boolean hepsiHarfVeyaRakamMi(String sifre) { // "asodhowqi"
        int index = 0;
        while (index < sifre.length()) {
            if (sifre.charAt(index) >= 'A' && sifre.charAt(index) <= 'Z' ||
                    sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z' ||
                    sifre.charAt(index) >= '0' && sifre.charAt(index) <= '9') {
                //
            } else {
                return false;
            }
            index++;
        }
        return true;
    }
    public static boolean ikidenFazlaRakamIceriyorMu(String sifre) {
        int index = 0;
        int say = 0;
        while (index < sifre.length()) {
            if (sifre.charAt(index) >= '0' && sifre.charAt(index) <= '9') {
                say++;
            }
            index++;
        }
        return say >= 2;
    }
}

