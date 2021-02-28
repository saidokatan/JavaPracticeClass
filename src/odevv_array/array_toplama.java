package odevv_array;

public class array_toplama {
    public static void main(String[] args) {
        int[] int_array = {2, 1, 1, 1, 1, 1, 1};
        int toplam=0, ort = 0;
        for (int i = 0; i < int_array.length; i++) {
            toplam = toplam + int_array[i];
        }
        ort = toplam / (int_array.length);
        System.out.println("Toplam= " + toplam);
        System.out.println("Ortlama=" + ort);
    }
}
