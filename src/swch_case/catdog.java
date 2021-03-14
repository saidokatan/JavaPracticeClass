package swch_case;

import java.util.Scanner;

public class catdog {
    public static void main(String[] args) {
        String evcil;
        Scanner girdi_evcil = new Scanner(System.in);
        System.out.print("Evcil Hayvani Giriniz..>  ");
        evcil = girdi_evcil.next();
        switch (evcil) {
            case ("DOG"):
            case ("CAT"):
                System.out.println("Domastik");
                break;
            case ("TIGER"):
                System.out.println("vahsi hayvan");
                break;
            default:
                System.out.println("tanimsiz");
        }
    }
}
