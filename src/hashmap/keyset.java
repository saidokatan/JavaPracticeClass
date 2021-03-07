package hashmap;

import java.util.HashMap;
import java.util.Map;

public class keyset {
    public static void main(String[] args) {
        HashMap<Integer, String> mymap = new HashMap<>();
        mymap.put(1, "Pazartesi");
        mymap.put(2, "Sali");
        mymap.put(3, "Carcamba");
        mymap.put(4, "Persembe");
        mymap.put(5, "Cuma");
        mymap.put(6, "Cumartesi");
        mymap.put(7, "Pazar");// Entry
        for(Integer key: mymap.keySet()) {
            System.out.println(key);
        }
        for(String value: mymap.values()){
            System.out.println(value);

        }
        for(Map.Entry eleman: mymap.entrySet()){
            System.out.print(eleman.getKey());
            System.out.println(" --> "+eleman.getValue());
        }
    }
}
