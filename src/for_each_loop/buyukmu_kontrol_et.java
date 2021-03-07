package for_each_loop;

import java.util.ArrayList;

public class buyukmu_kontrol_et {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list2.add(13);
        list2.add(2);
        list2.add(333);
        list1.addAll(list2);
        for (Integer buyuk : list1) {
            if (buyuk > 3) {
                System.out.println(buyuk + " sayisi 3 ten buyutur");
            } else {
                System.out.println(buyuk + " sayisi 3 ten kucuktur");
            }
        }
    }
}
