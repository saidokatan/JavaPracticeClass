package kendi_calsimalarim;
import java.util.Scanner;
public class atmIslemleri {
    public static void main(String[] args) {
        int islem;
        int bakiye = 5000;
        int para;
        Scanner giris = new Scanner(System.in);
        System.out.println("**** Yatir Banka Hosgeldiniz ****  ");
        System.out.println("********* Yatir Kazan ***********  ");
        System.out.println("Guncel Bakiyeniz...> " + bakiye + " TL dir");
        while (bakiye > 0) {
            System.out.println();
            System.out.println("Para Cekmek Icin ................ > 1 ");
            System.out.println("Para Yatirmak icin ...............> 2 ");
            System.out.println("Bakiye Sogulamak Icin.............> 3 ");
            System.out.println("Cikis Yapmak Icin.................> 4 ");
            System.out.print("Yapmak Istediginiz Islemi Seciniz...>  ");
                        islem = giris.nextInt();
            if (islem == 1) {
                System.out.println("Toplam Bakiyeniz....> " + bakiye);
                System.out.print("Cekmek IStediginiz Miktari Giriniz.....> ");
                para = giris.nextInt();
                if(para<=5000) {
                    bakiye -= para;
                    System.out.println("Paranizi Almayi Unutmayiniz.");
                    System.out.println(para + " TL Para Cektiniz.....> ");
                    System.out.println("Toplam Bakineyinz......> " + bakiye);
                }else {
                    System.out.println(bakiye + "den daha fazla para cekemezsiniz");
                }
            } else if (islem == 2) {
                System.out.print("Yatirmak Istediginiz Miktari Giriniz...> ");
                para = giris.nextInt();
                bakiye += para;
                System.out.println(para +" TL Para Yatirdiniz.....> ");
                System.out.println("Toplam Bakineyinz......> " + bakiye);
            } else if (islem == 3) {
                System.out.println("Toplam Bakiyeniz........> " + bakiye);
            } else if (islem == 4) {
                break;
            }
            System.out.println();
        }
        System.out.println("** Yine Bekleriz Para Yatir Daha Fazla Kazan ** ");
    }
}

