package swch;

import java.util.Scanner;

public class gecernot {
    public static void main(String[] args) {
        int not;
        Scanner girdi_not =new Scanner(System.in);
        System.out.println("Okul Numaranizi Giriniz..>  ");
        not= girdi_not.nextInt();
switch (not){
    case(321):
        System.out.println("Aldiginiz Not..>  98");
        break;
    case(213):
        System.out.println("Aldiginiz Not..>  87");
        break;
    case(354):
        System.out.println("Aldiginiz Not..>  99");
        break;
    case(124):
        System.out.println("Aldiginiz Not..>  100");
        break;
    case(150):
        System.out.println("Aldiginiz Not..>  92");
        break;
    default:
        System.out.println("yanli numara girdiniz");
}

    }
}
