package hashmap;

import java.util.HashMap;

public class ornek1 {
    public static void main(String[] args) {
        HashMap<String, String> mymap = new HashMap<>();
        mymap.put("tr", "Turkish");
        mymap.put("en", "English");
        mymap.put("de", "German");
        mymap.put("ar", "Arabic");
        boolean tr_icerirmi = mymap.containsKey("tr");
        boolean es_icerirmi = mymap.containsKey("es");
        System.out.println(tr_icerirmi);
        System.out.println(es_icerirmi);
        System.out.println(mymap);
        String ulke= mymap.get("tr");
        System.out.println(ulke);
        mymap.remove("de");
        System.out.println(mymap);


    }
}
