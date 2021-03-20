package oop_odev_cevre_alan_sap;

public class BaseClass {
    private int kenar1;
    private int kenar2;
    private double yaricap;

    public static int dikdorgenAlaniniHesapla(int kenar1, int kenar2) {

        int sonuc_alan = kenar1 * kenar2;
        return sonuc_alan;

    }

    public static int dikdortgenCevresiniHesapla(int kenar1, int kenar2) {
        int sonuc_kenar = (kenar1 * 2) + (kenar2 * 2);
        return sonuc_kenar;
    }

    public static int kareAlaniHesapla(int kenar1, int kenar2) {
        int sonuc_alan = kenar1 * kenar2;
        return sonuc_alan;
    }

    public static int kareCevreHesapla(int kenar1, int kenar2) {
        int sonuc_kenar = (kenar1 * 2) + (kenar2 * 2);
        return sonuc_kenar;
    }

    public static double cemberCevre(double yaricap) {
        double sonuc_cevre = 2 * yaricap * 3.14;
        return sonuc_cevre;
    }

    public static double cembreAlan(double yaricap) {
        double sonuc_alan = yaricap * yaricap * 3.14;
        return sonuc_alan;
    }
}


