package odevler_for_each;

public class Karesinin_toplami {
    public static void main(String[] args) {
        int[] sayilar = {3, 2, 4, 2, 5, 2};
        int sonuc = 1;
        int toplam = 0;
        for (Integer carpim : sayilar) {
            sonuc=carpim*carpim;
            toplam=sonuc+toplam;
            System.out.println("karesi..>" + sonuc);
            carpim++;
                    }
        System.out.println("toplami..>" + toplam);
    }
}
