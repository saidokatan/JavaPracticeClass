package oop_odev_cevre_alan_sap;

public class BaseClass {
    private int kenar1;
    private int kenar2;



    public static int dikdoorgeninAlaniniHesapla(int kenar1, int kenar2) {

        int sonuc_alan = kenar1 * kenar2;
        return sonuc_alan;

    }

    public static int dikdotgeninCevresiniHesapla(int kenar1, int kenar2) {
        int sonuc_kenar = (kenar1 * 2) + (kenar2 * 2);
        return sonuc_kenar;
    }

}
