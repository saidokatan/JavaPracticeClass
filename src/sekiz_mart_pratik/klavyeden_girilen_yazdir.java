package sekiz_mart_pratik;

import java.util.Scanner;

public class klavyeden_girilen_yazdir {
    public static void main(String[] args) {

        Scanner sekil = new Scanner(System.in);
        Scanner kac_adet = new Scanner(System.in);
        System.out.print("Bir Karakter Giriniz..> ");
        String sekil1 = sekil.next();
        System.out.print("Kac adet Istiyorsunuz");
        Integer adet = kac_adet.nextInt();
        for (int i = 0; i <  adet; i++) {
            for (int j = 0; j <  i; j++) {
                System.out.print(sekil1);
            }
            System.out.println();
        }


    }


}
