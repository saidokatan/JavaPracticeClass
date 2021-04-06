package kendi_calsimalarim;

public class classBasitIslemler {
    public static void main(String[] args) {

        System.out.println(kuvvet(2, 3));
        System.out.println(add(2, 3));
        kuvvet(3, 3);
        add(3, 3);
    }

    static int kuvvet(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;

        }
        return result;
    }

    static int add(int x, int y) {
        int result = 0;
        result = x + y;
        return result;
    }
}
