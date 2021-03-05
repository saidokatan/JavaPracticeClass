package swch;

import java.util.Locale;
import java.util.Scanner;

public class haftanin_gunu {// ay girildiginde ayin kac gun oldugunu bulan program

    public static void main(String[] args) {
        String hangi_ay;
        Scanner ay_kac_gun = new Scanner(System.in);
        System.out.println("Gununu ogrenmek istediginiz ayi giriniz..> ");
        hangi_ay = ay_kac_gun.next();
        String trim_ay = hangi_ay.trim().toLowerCase(Locale.ROOT);
        switch (trim_ay) {
            case "ocak":
            case "subat":
            case "mart":
            case "nisan":
            case "mayis":
            case "haziran":
                System.out.println("Girdiginiz ay 31 gun cekmektedir.");
                break;
            case "temmuz":
            case "agustos":
            case "eylul":
            case "ekim":
            case "kasim":
            case "aralik":
                System.out.println("Girdiginiz ay 30 gun cekmektedir");
                break;


        }
    }
}
