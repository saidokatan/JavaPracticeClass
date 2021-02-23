package sorular_1;

import java.util.Scanner;

public class saru_5 {
    public static void main(String[] args) {
        int not;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Notunuzu Giriniz..>  ");
        not = girdi.nextInt();
        if (not >= 0 && not < 50) {
            System.out.println("Aldiginiz Not..>  D dir");
        } else if (not >= 50 && not <= 70) {
            System.out.println("Aldiginiz Not..>  C dir");
        } else if (not >= 71 && not <= 85) {
            System.out.println("Aldiginiz Not..>  B dir");
        } else if (not >= 86 && not <= 100) {
            System.out.println("Aldiginiz Not..>  A dir");
        }
        System.out.println(" Yanlis Not girdiniz");
    }
}

