package hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class eleman_atama {
    public static void main(String[] args) {
        HashSet<String> isim = new HashSet<>();
        isim.add("mehmet");
        isim.add("Kemel");
        isim.add("Nuran");
        System.out.println(isim);
        isim.add("mustafa");
        System.out.println(isim);
        boolean mehmet_icerirmi = isim.contains("mehmet");
        boolean haci_icerirmi = isim.contains("haci");
        System.out.println(mehmet_icerirmi);
        System.out.println(haci_icerirmi);
        isim.remove("mehmet");
        System.out.println(isim);
        Iterator<String> iterator = isim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
