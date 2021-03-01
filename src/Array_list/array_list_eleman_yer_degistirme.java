package Array_list;

import java.util.ArrayList;
import java.util.Locale;

public class array_list_eleman_yer_degistirme {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("rusya");
            list.add("zonguldak");
            list.add("Tokat");
            list.set(2, "ankara");
            int uzunluk = list.size();
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ".ci eleman " + list.get(i).toUpperCase(Locale.ROOT));
            }
    }
}
