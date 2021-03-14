package swch_case;

import java.util.Scanner;

public class sehirplaka {
    public static void main(String[] args) {
        String sehir;
        Scanner girdi_sehir =new Scanner(System.in);
        System.out.print("Ilinizi Giriniz..>  ");
        sehir= girdi_sehir.next();
        switch (sehir){
            case("Istanbul"):
                System.out.println("Plaka Nosu..> 34");
                break;
            case("Ankara"):
                System.out.println("Plaka Nosu..>  06");
                break;
            case("Antalya"):
                System.out.println("Plaka Nosu..>  07");
                break;
            case("Bursa"):
                System.out.println("Plaka Nosu..>  16");
                break;
            case("Bitlis"):
                System.out.println("Plaka Nosu..>  13");
                break;
            default:
                System.out.println("yanli Sehir girdiniz");
        }
    }
}
