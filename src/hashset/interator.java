package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class interator {
    public static void main(String[] args) {
        HashSet<String> isimler = new HashSet<>();
        isimler.add("Ali");
        isimler.add("Kemal");
        isimler.add("Cemal");
        isimler.add("Nimet");
        Iterator<String> iter_isim = isimler.iterator();
        while (iter_isim.hasNext()) {
            System.out.println(iter_isim.next());
        }
        isimler.add("nuran");
        System.out.println(isimler);
    }
}
