package hashset;

import java.util.HashSet;

public class toplam {
    public static void main(String[] args) {
        HashSet<Integer> sayi = new HashSet<>();
        sayi.add(1);
        sayi.add(3);
        sayi.add(5);
        sayi.add(6);
        sayi.add(7);
        int toplam = 0;

        for(int sayilar:sayi){
            toplam += sayilar;
        }
        System.out.println(toplam);
    }

}
