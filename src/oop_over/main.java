package oop_over;

public class main {
    public static void main(String[] args) {
        calisan aktifCalisan = new calisan("Ali", "Kundilli", 34, 64255024, "Ankara Universitesi");
        yonetici aktifYonetici = new yonetici("Bilen", "Erdinc", 45, 2452411, "Basketbol");
        aktifCalisan.yazdir();
        System.out.println();
        System.out.println();
        aktifYonetici.yazdir();
        aktifYonetici.projeyiBaslat("Java Projesi");

    }
}
