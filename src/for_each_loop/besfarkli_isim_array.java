package for_each_loop;

import java.util.ArrayList;

public class besfarkli_isim_array {
    public static void main(String[] args) {
        ArrayList<String> besisim = new ArrayList<>();
        String[] sesli = {"a", "e", "i", "o"};
        besisim.add("ugur");
        besisim.add("Huseyin");
        besisim.add("Kemal");
        besisim.add("Nimet");
        besisim.add("Aysenur");
        for (String isim : besisim) {
            for (String varmi:sesli){
                if (isim.contains(varmi)){
                    System.out.println(isim + " " +varmi +  " iceririr");
                }
                else {
                    System.out.println(isim + " " +varmi +  " icerirmez");
                }
            }
        }
    }
}
