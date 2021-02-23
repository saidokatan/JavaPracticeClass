package homework;

import java.util.Scanner;

public class hmm4 {
    // Konsola 3 sayı yazdiriniz ve en büyükle en kucugun farkini bulunuz

    public static void main(String[] args) {
        int birinci_sayi;
        int ikinci_sayi;
        int ucuncu_sayi;
        Scanner sayi_1 = new Scanner(System.in);
        Scanner sayi_2 = new Scanner(System.in);
        Scanner sayi_3 = new Scanner(System.in);
        System.out.print("Birinci Sayiyi giriniz..>");
        birinci_sayi = sayi_1.nextInt();
        System.out.print("Ikinci Sayiyi giriniz..>");
        ikinci_sayi = sayi_2.nextInt();
        System.out.print("Ucuncu Sayiyi giriniz..>");
        ucuncu_sayi = sayi_3.nextInt();
        int enbuyuk = (birinci_sayi >= ikinci_sayi) ? ((birinci_sayi >= ucuncu_sayi)
                ? birinci_sayi : ucuncu_sayi) : ((ikinci_sayi >= ucuncu_sayi) ? ikinci_sayi : ucuncu_sayi);
        int enkucuk = (birinci_sayi <= ikinci_sayi) ? ((birinci_sayi <= ucuncu_sayi)
                ? birinci_sayi : ucuncu_sayi) : ((ikinci_sayi <= ucuncu_sayi) ? ikinci_sayi : ucuncu_sayi);
        System.out.println(" En buyuk Sayi ile en kucuk sayinin Farki..>"+ (enbuyuk - enkucuk));


    }

}
