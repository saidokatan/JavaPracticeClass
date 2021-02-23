package ifelse;

import java.util.Scanner;

public class ayni_isaretli {
    public static void main(String[] args) {
        int sayi_1, sayi_2;

        Scanner isaret = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz...> ");
        sayi_1 = isaret.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz...> ");
        sayi_2 = isaret.nextInt();
        if (sayi_1<0 && sayi_2<0) {
            System.out.print("Sayilarin Idaretleri Aynidir...> ");
        }   else if (sayi_1>0 && sayi_2>0){
            System.out.print("Sayilarin Idaretleri Aynidir...> ");
        }
            else {
            System.out.print("Sayilarin Isaretleri Farklidir..> ");
        }
    }
}
