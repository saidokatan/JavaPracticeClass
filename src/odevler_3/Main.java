package odevler_3;

public class Main {
    /*
 -Bir şifre en az on karakterden oluşmalıdır.
 -Bir şifre en az iki rakam içermelidir.
  -Bir şifre sadece harf ve rakamlardan oluşur.
  */
    public static void main(String[] args) {
        sifreSaglamMi("as-djal0223");
    }
        public static boolean sifreSaglamMi (String sifre){
            if (sifre.length() < 10) {
                System.out.println("Sifrenin uzunlugu 10dan kucuktur.");
                return false;
            }
            if (!Utils.ikidenFazlaRakamIceriyorMu(sifre)) {
                System.out.println("Sifrede 2den az rakam bulunmaktadir.");
                return false;
            }
            if (!Utils.hepsiHarfVeyaRakamMi(sifre)) {
                System.out.println("Sifrede harf ve rakamdan farkli bir karakter bulunmaktadir.");
                return false;
            }
            System.out.println("Sifreniz gecerlidir.");
            return true;
        }
    }


