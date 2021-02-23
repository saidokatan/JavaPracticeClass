package sorular_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class soru_7 {
    public static void main(String[] args) {
        //// Numbers divided by 3,5,15 from 1 to 100
        //// Divided by 3: 3 6 9 12 ----
        //// Divided by 5 :5 10 15 20 --
        //// Divided by 15 : 15 30 45 60-

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i+" ");

            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i+" ");
            }
        }
            }

        }


