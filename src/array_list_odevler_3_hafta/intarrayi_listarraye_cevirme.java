package array_list_odevler_3_hafta;

import java.util.ArrayList;

public class intarrayi_listarraye_cevirme {
    public static void main(String[] args) {
        int[] int_array={4,2,6,7};
        ArrayList<Integer> list_int_array=new ArrayList<>();
        int uzunluk= int_array.length;
        for (int i = 0; i < uzunluk; i++) {
            list_int_array.add(int_array[i]);
        }
        System.out.println(list_int_array);

    }
}
