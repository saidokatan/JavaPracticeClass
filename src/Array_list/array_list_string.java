package Array_list;

import java.util.ArrayList;
import java.util.Locale;

public class array_list_string {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ankara");
        list.add("istanbul");
        list.add("kirikkale");
        int uzunluk = list.size();
        System.out.println(uzunluk);
      /*  int birinci_eleman=list.get(0);
        int ikinci_eleman=list.get(1);
        int ucuncu_eleman=list.get(2);*/
        for(int i=0;i< list.size();i++){
            System.out.println((i+1)+".ci eleman "+ list.get(i).toUpperCase(Locale.ROOT));
        }
    }
}
