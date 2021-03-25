package kutuphane_oops;

import java.util.Scanner;

public class bookAdds extends libraryMain{
    public static void bookAdds(){
        System.out.println("** Kitap Ekleme Bolumu **");
        Scanner kitapEkle = new Scanner(System.in);
        System.out.println("Kitabin Adi Giriniz.............> ");
        libraryMain.kitapAdi=kitapEkle.next();
        System.out.println("Kitabin Yazarini Giriniz........> ");
        libraryMain.kitapYazari=kitapEkle.next();
        System.out.println("Kitabin Basim Tarihini Giriniz..> ");
        libraryMain.yayinTarihi=kitapEkle.next();
        bookId++;
        kitapInfo= kitapAdi + " - " + kitapYazari+ " - " + yayinTarihi;
        libraryMain.kitaplar.put(bookId,kitapInfo);
        mainMenu.mainMenu();
    }
}
