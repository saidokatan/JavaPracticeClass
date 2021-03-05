package Array_list;

import java.util.ArrayList;

public class arraylist_contains {
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
        boolean icerirmi_25 = array_1.contains(25);
        boolean icerirmi_35 = array_1.contains(35);
        boolean array_bosmu = array_1.isEmpty();
        System.out.println(icerirmi_25);
        System.out.println(icerirmi_35);
        System.out.println(array_bosmu);
        array_1.clear();
        boolean array_bosmu_sonra = array_1.isEmpty();
        System.out.println(array_bosmu_sonra);
        array_1.add(12);
        System.out.println(array_1.get(0));

    }
}
