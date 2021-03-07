package array_list_odevler_3_hafta;

import java.util.ArrayList;

public class list1_tersten_list2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        String yedek;
        list1.add("Angara");
        list1.add("Adana");
        list1.add("Gayseri");
        list1.add("Girikkale");
        list1.add("Tohat");
        // list2.add(list1.get(1));
        // System.out.println(list2);
        //   list2 = (ArrayList<String>) list1.clone();
        int uzunluk = list1.size();
        for (int i = uzunluk - 1; i >= 0; i--) {
            list2.add(list1.get(i));
         //   System.out.println("list 2 in " + (i + 1) + ". elamani " + list2.get(i));
        }
        System.out.println(list2);

    }


}