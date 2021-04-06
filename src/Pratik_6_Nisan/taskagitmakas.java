package Pratik_6_Nisan;

import java.util.Random;
import java.util.Scanner;

public class taskagitmakas {
    public static void main(String[] args) {
        char devam_mi;
        int bilgisayar_kazandı = 0;
        int oyuncu_kazandı = 0;
        int beraberlik = 0;

        Scanner scan = new Scanner(System.in);

        do {
            // Oyuncuya menu sunduk ve deger aldık
            System.out.println("Tas icin 1 \nKagıt icin 2\nMakas icin 3");
            int oyuncu = scan.nextInt();

            if (oyuncu == 1) {
                System.out.println("Tas sectin");
            } else if (oyuncu == 2) {
                System.out.println("Kagıt sectin");
            } else if (oyuncu == 3) {
                System.out.println("Makas sectin");
            } else {
                System.out.println("gecersiz deger...");
            }

            //Random class dan bir obje olusturduk ve 1 ile 3 arasında bir deger urettirdik
            Random rnd = new Random();
            int bilgisayar = rnd.nextInt(3) + 1; // 1 2 3

            // Urettirdigimiz rakama gore bilgisayarın secenegini yazdırıyoruz
            if (bilgisayar == 1) {
                System.out.println("Bilgisayar Tas secti");
            } else if (bilgisayar == 2) {
                System.out.println("Bilgisayar Kagıt secti");
            } else if (bilgisayar == 3) {
                System.out.println("Bilgisayar Makas secti");
            }

            if (oyuncu == bilgisayar) {
                System.out.println("Berabere kaldınız");
                beraberlik++;
            } else if ((oyuncu == 1 && bilgisayar == 3) || (oyuncu == 2 && bilgisayar == 1) || (oyuncu == 3 && bilgisayar == 2)) {
                System.out.println("Sen Kazandın...");
                oyuncu_kazandı++;
            } else {
                System.out.println("Bilgisayar kazandı");
                bilgisayar_kazandı++;
            }

            System.out.println("Devam etmek istiyor musun(e/h)");
            devam_mi = scan.next().charAt(0);


        }while (devam_mi == 'e');

        System.out.println("Bilgisayar " + bilgisayar_kazandı + " kazandı");
        System.out.println("Sen " + oyuncu_kazandı + " kazandın");
        System.out.println( beraberlik + " defa berabere kaldınız");

        if (bilgisayar_kazandı > oyuncu_kazandı) {
            System.out.println("......Sonucta bilgisayar kazandı....");
        } else if (oyuncu_kazandı > bilgisayar_kazandı) {
            System.out.println("......Sonucta Oyuncu kazandı....");
        } else {
            System.out.println("......Toplamda beraberlik var....");
        }




    }
}

