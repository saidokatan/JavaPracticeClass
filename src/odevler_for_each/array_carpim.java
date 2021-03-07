package odevler_for_each;

public class array_carpim {
    public static void main(String[] args) {
        int[] sayilar = {2, 4, 6, 8, 9, 12};
        int sonuc = 1;
        for (Integer carpim : sayilar) {
            sonuc = sonuc * carpim;
            carpim++;
        }
        System.out.println("sonuc..>" + sonuc);
    }
}
