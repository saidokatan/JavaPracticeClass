package kutuphane_oops;

import java.util.Scanner;

public class bookDelete extends libraryMain{
    public static void bookDelete(){
        System.out.println("** Kitap Silme Bolumundesiniz ** ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Silinmesini istedigin id yi giriniz...> ");
        libraryMain.silinen = scan.nextInt();
        if(libraryMain.kitaplar.isEmpty()) {
            System.out.println("Hic kitap yok");
        } else if(libraryMain.kitaplar.containsKey(silinen)) {
            libraryMain.silinenKitap = libraryMain.kitaplar.remove(silinen);
            System.out.println(libraryMain.silinenKitap + " basarıyla silinmistir");
        } else {
            System.out.println("Bu id bilgisine sahip kitap bulunmamaktadır");
        }
        mainMenu.mainMenu();
    }

}
