package homework;

import java.util.Scanner;

public class hm3 {
    public static void main(String[] args) {
        //Ehliyet alma yaşı 18 dir.
        // Kullanıcıdan yasini isteyiniz ve
        // ehliyet alıp alamayacagini konsola yazdiriniz.

        int yas;
        Scanner ehliyet = new Scanner(System.in);
        System.out.print("Yasinizi Giriniz........ >");
        yas = ehliyet.nextInt();
        String sonuc=(yas<18) ? "Yasiniz Ehliyet Icin Uygun Degil":" En Yakin bir surucu kursuna giderek " +
                "ehliyet alabilirsiniz";
        System.out.println(sonuc);

    }
}
