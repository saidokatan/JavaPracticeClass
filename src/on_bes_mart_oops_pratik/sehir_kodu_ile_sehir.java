package on_bes_mart_oops_pratik;

import java.util.Scanner;

public class sehir_kodu_ile_sehir {
    public static void main(String[] args) {
        String Cities [] = {"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara","Antalya",
                "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
                "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
                "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
                "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
                "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce" } ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Plaka kodunu gir");
        int plaka = scan.nextInt();
        if(plaka > 0 && plaka<81) {
            System.out.println(plaka + "......." + Cities[plaka-1]);
        } else {
            System.out.println("1 ile 81 arasında bir deger giriniz");
        }
        System.out.print("Sehir ismini giriniz: ");
        String sehir = scan.next();
        for (int i=0; i<Cities.length-1; i++) {
            if (sehir.equalsIgnoreCase(Cities[i])) {
                System.out.println((i+1) + "......" + Cities[i]);
            }
        }
    }
}
