package arrays;

public class dizi_eleman_ekleme {
    public static void main(String[] args) {
        int[] int_array = new int[]{4, 5, 6, 7};
        int[] int_array_yeni = new int[5];
        for (int i = 0; i < int_array.length; i++) {
            int_array_yeni[i] = int_array[i];
        }
        int_array_yeni[4] = 10;
        for (int i = 0; i < int_array_yeni.length; i++) {
            System.out.println("ikinci Dizinin " + (i + 1) + " inci elemani  " + int_array_yeni[i]);
        }
    }
}
