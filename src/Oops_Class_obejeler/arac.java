package Oops_Class_obejeler;

import com.sun.org.apache.xerces.internal.impl.xs.SubstitutionGroupHandler;

public class arac {
    private String marka;
    private String renk;
    private int model;
    private int fiyat;
    public arac() {
    }
    public arac(String marka, String renk, int model, int fiyat) {
        this.marka = marka;
        this.renk = renk;
        this.model = model;
        this.fiyat = fiyat;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public int getFiyat() {
        return fiyat;
    }
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


}
