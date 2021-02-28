package arrays;

public class array_deger_atama {
    public static void main(String[] args) {
        int[] int_array = new int[4];
        int_array[0] = 4;
        int_array[1] = 5;
        int_array[2] = 6;
        int_array[3] = 7;
        for (int i = 0; i < int_array.length; i++) {
            System.out.println((i+1) + "  inci eleman..> " + int_array[i]);
        }
    }
}
