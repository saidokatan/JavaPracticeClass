package Array_list;

import java.util.ArrayList;
import java.util.Locale;

public class arraylist_eleman_ekleme {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("rusya");
        list.add("zonguldak");
        list.add("Tokat");
        list.add(2, "ankara");
        int uzunluk = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ".ci eleman " + list.get(i).toUpperCase(Locale.ROOT));
        }
    }
}