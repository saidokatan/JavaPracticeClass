package oop_over;

public class calisan extends ortakOzellikler {
    private String universite;

    public calisan(String isim, String soyisim, int yas, int telNo, String universite) {
        super(isim, soyisim, yas, telNo);
        this.universite = universite;

    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Bitidigi Univrsite...>" + universite);
    }
}
