package Praktice_3_hafta;

import java.util.Arrays;

public class array_siralama_2 {
    public static void main(String[] args) {

            int a [] = {1, 2, -10, 50, 5};
            System.out.println(Arrays.toString(a));
            for (int i=0; i<a.length; i++) {
                for(int j=0; j<a.length; j++) {
                    if (a[i] < a[j]) {
                        int yedek = a[i];
                        a[i] = a[j];
                        a[j] = yedek;
                    }
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }