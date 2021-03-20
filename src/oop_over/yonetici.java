package oop_over;

public class yonetici extends ortakOzellikler {
    private String spor;

    public yonetici(String isim, String soyisim, int yas, int telNo, String spor) {
        super(isim, soyisim, yas, telNo);
        this.spor = spor;
    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Yaptigi Spor...> " + spor);
    }

    public void projeyiBaslat(String baslat){
                System.out.println("Yeni Proje Ismi..> "+baslat);

            }

}
