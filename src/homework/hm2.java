package homework;

import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
        //Ucgenin ic acıları toplamı 180 dir.
        // Konsola kullanicidan üçgenin 2 acisini sirasiyla isteyiniz
        // ve 3. Acıyı hesaplayarak konsola yazdiriniz. Eğer kullanıcın girdiği
        // ilk 2 sayinin toplamı 180 den büyükse “yanlış aci girildi” uyarısı veriniz.

        int aci_1;
        int aci_2;
        Scanner aci1 = new Scanner(System.in);
        Scanner aci2 = new Scanner(System.in);
        System.out.println(">>>>>Bu program Ucgenin Ic Acilarini Hesaplar<<<<<<");
        System.out.print(" Birinci Aciyi Giriniz......: ");
        aci_1 = aci1.nextInt();
        System.out.print(" Ikinci Aciyi Giriniz.......: ");
        aci_2 = aci2.nextInt();
        int aci_3 = aci_1 + aci_2;
        String sonuc = (aci_3 >= 180) ? " Yanlis Sayi Deger Girdiniz" : String.valueOf(180 - aci_3);

        System.out.println(" Ucuncu Acinin Degeri.......>  " + sonuc);


    }
}
