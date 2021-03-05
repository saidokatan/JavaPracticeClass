package array_list_odevler_3_hafta;

import java.util.ArrayList;

public class yedi_elemanli_string {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Arrarimize elaman atama yaptik
        list.add("Belcika");
        list.add("Hollanda");
        list.add("Almanya");
        list.add("Fransa");
        list.add("Luxemburg");
        list.add("Avusturya");
        list.add("Kanada");
        //Silmeden once Yazdiralim
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ".ci elaman " + list.get(i) + "  dir");
            // Ikinci elemani silelim
        }
        System.out.println();
        System.out.println("Ikinci elemani cikardik");
        System.out.println();

        list.remove(1);
        // Tekrar Yazdiralim
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ".ci elaman " + list.get(i) + "  dir");

        }
        list.add(2, "ADD");
        System.out.println();
        System.out.println("ucuncu elemani ADD olarak ekledik");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ".ci elaman " + list.get(i) + "  dir");
        }

    }
}