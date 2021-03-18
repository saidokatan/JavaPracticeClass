package oop_odev_mathUtils;

public class mathUtils {
    private int sayi_Karesi;
    private int sayi_beslecarp;
    private int sayi1, sayi2, sayi3;

    public static int sayininKaresi(int sayi_Karesi) {
        int sonuc_Karesi = sayi_Karesi * sayi_Karesi;
        return sonuc_Karesi;
    }

    public static int sayiyiBesleCarp(int sayi_beslecarp) {
        int sonuc_besle_carp = sayi_beslecarp * 5;
        return sonuc_besle_carp;
    }

    public static int ucSayininToplami(int sayi1, int sayi2, int sayi3) {
        int sonuc_uc_sayinin_toplami = sayi1 + sayi2 + sayi3;
        return sonuc_uc_sayinin_toplami;

    }

}
