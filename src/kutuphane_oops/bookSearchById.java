package kutuphane_oops;

import java.util.Scanner;

public class bookSearchById extends libraryMain{
    public static void bookSearchById(){
        System.out.println("** ID ile Kitap Arama Yapar ** ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Bulunmasını istedigin id yi gir: ");
        libraryMain.isteneId = scan.nextInt();
        if (libraryMain.kitaplar.isEmpty()) {
            System.out.println("Hic kitap yok");
        } else if (libraryMain.kitaplar.containsKey(libraryMain.isteneId)) {
            libraryMain.bulunanKitap = libraryMain.kitaplar.get(libraryMain.isteneId);
            System.out.println("Aradıgınız kitap : " + bulunanKitap);
        } else {
            System.out.println("Bu id bilgisine sahip kitap bulunmamaktadır");
        }
        mainMenu.mainMenu();
    }
}
