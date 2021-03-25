package kutuphane_oops;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;

import java.util.HashMap;
import java.util.Scanner;

public class libraryMain {
    static String kitapInfo;
    static int processNumber;
    static int bookId = 1000;
    static String kitapAdi;
    static String kitapYazari;
    static String yayinTarihi;
    static int silinen;
    static String silinenKitap;
    static int isteneId;
    static String bulunanKitap = "";

    static HashMap<Integer, String> kitaplar = new HashMap<>();

    public static void main(String[] args) {
        kitaplar.put(bookId, "Dirilis - Tolsoy - 1976");
        bookId++;
        kitaplar.put(bookId, "Satranc - Stefan Zweig - 2000");
        bookId++;
        mainMenu.mainMenu();
        switch (processNumber) {
            case (1):
                bookAdds.bookAdds();
                System.out.println(kitaplar);
                break;
            case (2):
                bookDelete.bookDelete();
                System.out.println(kitaplar);
                break;
            case (3):
                booklListAll.booklListAll();
                break;
            case (4):
                bookSearchById.bookSearchById();
                break;
            case (5):
                bookSearchByInfo.bookSearchByInfo();
                break;
            case (6):
                System.out.println("** Programdan Cikis Yaptiniz ** ");
                break;
            default:
                System.out.println("*** Lutfen Gecerli Bir Giris Yapiniz ***");
        }

    }
}
