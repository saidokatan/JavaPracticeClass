package array_list_odevler_3_hafta;

public class ondan_buyukleri_toplama {
    public static void main(String[] args) {
        int[] int_array = {11, 6, 1, 11, 10, 2};
        int toplam = 0;
        for (int i = 0; i < int_array.length; i++) {
            if (int_array[i] > 10) {
                toplam = toplam + int_array[i];

            }
        }
        System.out.println(toplam);
    }
}
