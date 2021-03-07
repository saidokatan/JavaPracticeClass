package hashmap;

import java.util.HashMap;

public class olusturma {
    public static void main(String[] args) {
        HashMap<Integer, String> mymap = new HashMap<>();
        mymap.put(1, "Pazartesi");
        mymap.put(2, "Sali");
        mymap.put(3, "Carcamba");
        mymap.put(4, "Persembe");
        mymap.put(5, "Cuma");
        mymap.put(6, "Cumartesi");
        mymap.put(7, "Pazar");// Entry
        boolean bir_icerirmi = mymap.containsKey(1);
        boolean sekiz_icerirmi = mymap.containsKey(8);
        boolean sali_icerirmi = mymap.containsValue("Sali");
        boolean hafta_icerirmi = mymap.containsValue("Hafta");
        System.out.println(bir_icerirmi);
        System.out.println(sekiz_icerirmi);
        System.out.println(sali_icerirmi);
        System.out.println(hafta_icerirmi);
        mymap.remove(4);
        System.out.println(mymap);
        mymap.remove(6, "Cumartesi");
        System.out.println(mymap);
        mymap.replace(1,"PAZARTESI");
        System.out.println(mymap);
        mymap.replace(5,"Cuma","CUMA");
        System.out.println(mymap);


    }
}
