package oop_odev_bilgisayar_parcalari;

public class main {
    public static void main(String[] args) {
        oop_odev_bilgisayar_sinifi b1 = new oop_odev_bilgisayar_sinifi(12, "Amd Ryzen3", 13);
        oop_odev_bilgisayar_sinifi b2 = new oop_odev_bilgisayar_sinifi(16, "Amd Ryzen5", 15);
        oop_odev_bilgisayar_sinifi b3 = new oop_odev_bilgisayar_sinifi(8, "Amd Ryzen7", 17);
        oop_odev_bilgisayar_sinifi b4 = new oop_odev_bilgisayar_sinifi(4, "Amd Ryzen3", 14);
        oop_odev_bilgisayar_sinifi b5 = new oop_odev_bilgisayar_sinifi(12, "Amd Ryzen5", 13);

        int[] ekran_array = {b1.ekran_boy, b2.ekran_boy, b3.ekran_boy, b4.ekran_boy, b5.ekran_boy};
        int i = 0;
        /*for (int i = 0; i < ekran_array.length; i++) {
            if (ekran_array[i] > 13) {
                System.out.println("Ekranı 13 ten büyük olan: Bilgisayar" + (i + 1));
            }
        }*/
        while (i<ekran_array.length){
            if (ekran_array[i]>13) {
                System.out.println("Bilgisayar " + (i+1));
            }
            i++;
            }
        }
    }


