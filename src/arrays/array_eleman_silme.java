package arrays;

public class array_eleman_silme {
    public static void main(String[] args) {
        int[] int_array = new int[]{4, 5, 6, 7,76};
        int[] int_array_yeni = new int[4];

        for (int i = 0; i < int_array_yeni.length; i++) {
            int_array_yeni[i] = int_array[i];
       // }
               //Ikinici array elemanlarini yazdirmak.
      //  for (int i = 0; i < int_array_yeni.length; i++) {
            System.out.println("ikinci Dizinin " + (i + 1) + " inci elemani  " + int_array_yeni[i]);
        }


    }
}
