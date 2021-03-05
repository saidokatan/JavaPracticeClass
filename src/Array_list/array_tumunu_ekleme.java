package Array_list;

import java.util.ArrayList;

public class array_tumunu_ekleme {
    public static void main(String[] args) {
        ArrayList<Integer> array_1 = new ArrayList<>();
        ArrayList<Integer> array_2 = new ArrayList<>();
        array_1.add(10);
        array_1.add(8);
        array_1.add(3);
        array_2.add(12);
        array_2.add(25);
        array_2.add(38);
        array_1.addAll(array_2);
        for (int i = 0; i < array_1.size(); i++) {
            System.out.println("Birinci Arrayin  " + (i + 1)+" inci elemani..> "+array_1.get(i));

        }

    }
}
