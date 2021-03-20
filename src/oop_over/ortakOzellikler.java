package oop_over;

public class ortakOzellikler {
    private String isim;
    private String soyisim;
    private int yas;
    private int telNo;

    public ortakOzellikler(String isim, String soyisim, int yas, int telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.telNo = telNo;

    }
    public void yazdir(){
        System.out.println("Adi............> " + this.isim);
        System.out.println("Soyadi Adi.....> " + this.soyisim);
        System.out.println("Yasi...........> " + this.yas);
        System.out.println("Tel No.........> " + this.telNo);
    }

}
