package forloop;

import java.util.Scanner;

public class forl_loop {
    public static void main(String[] args) {
        int sayi;
        int carpim = 1;
        Scanner kelime = new Scanner(System.in);
        System.out.print("Bir SAyi Giriniz..>");
        sayi = kelime.nextInt();
        if (sayi <= 0) {
            System.out.print("SAyi sifirsan buyuk olmali..>");

            }
            else{

                for (int i = 1; i <= sayi; i++) {
                    carpim *= i;
                }
                System.out.println("sayi..>" + carpim);
            }
        }
    }