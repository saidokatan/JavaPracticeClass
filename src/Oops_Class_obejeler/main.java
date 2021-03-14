package Oops_Class_obejeler;

public class main {
    public static void main(String[] args) {
        arac bmw1 = new arac("BMW", "mavi", 2020, 100000);
        arac bmw2 = new arac();
        bmw2.setMarka("BMW");
        bmw2.setRenk("Kirmizi");
        bmw2.setModel(2010);
        bmw2.setFiyat(50000);
        // bmw1'in bilgilerini alalim
        int bmw1_fiyat = bmw1.getFiyat();
        String bmw1_marka = bmw1.getMarka();
        int bmw1_model = bmw1.getModel();
        String bmw1_renk = bmw1.getRenk();

        System.out.println(bmw2);
    }
}
