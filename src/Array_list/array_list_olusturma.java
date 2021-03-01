package Array_list;

import java.util.ArrayList;

public class array_list_olusturma {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        int uzunluk = list.size();
        System.out.println(uzunluk);
      /*  int birinci_eleman=list.get(0);
        int ikinci_eleman=list.get(1);
        int ucuncu_eleman=list.get(2);*/
        for(int i=0;i< list.size();i++){
            System.out.println((i+1)+".ci eleman "+ list.get(i));
        }
    }
}
