package kutuphane_oops;

import java.util.Scanner;

public class bookSearchByInfo extends libraryMain{
    public static void bookSearchByInfo(){
      System.out.println("** Kitap Bilgilerine Gore Arama Yapar ** ");
        String aranan_info, kitapInfo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kitap bilgisini gir: ");
        aranan_info = scan.next();
        if (kitaplar.isEmpty()) {
            System.out.println("Hic kitap bulunmamaktadır");
        } else {
            for (int d = 1000; d <= bookId; d++) {
                if (kitaplar.containsKey(d)) {
                    kitapInfo = kitaplar.get(d);
                    if (kitapInfo.contains(aranan_info)) {
                        System.out.println(kitapInfo);
                    }
                }
            }
        }
        mainMenu.mainMenu();
    }
}