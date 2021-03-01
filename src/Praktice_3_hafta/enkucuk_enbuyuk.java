package Praktice_3_hafta;

import static java.lang.System.*;

public class enkucuk_enbuyuk {
    public static void main(String[] args) {
        int numbers [] = {10, 4, 1, 4, -10, -50, 32, 21};
        int max = 0;
        int min = 0;
        for (int i = 0; i<numbers.length; i++) {
            if ( numbers[i] > max ) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("maximum  deger = " + max);
        System.out.println("minimum deger = " + min);
        System.out.println("Fark =" + (max - min));

    }
}
