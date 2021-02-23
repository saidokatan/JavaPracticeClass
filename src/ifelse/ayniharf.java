package ifelse;

import java.util.Scanner;

public class ayniharf {
    public static void main(String[] args) {
        String harf;
       // String ayni_harf;

        Scanner ayni_harf = new Scanner(System.in);

        System.out.print("Bir Harf Giriniz...>");
        harf = ayni_harf.next();
        if (harf == "a" || harf == "e") {
            System.out.println("Bir Harf Giriniz...>");
        } else if (harf == "b" || harf == "c") {
            System.out.println("Bidi Bidi...>");
        } else {
            System.out.println("Hepsi Yanlis...>");
        }
    }
}
