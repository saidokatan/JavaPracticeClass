package hashset;

import java.util.HashSet;

public class foreach {
    public static void main(String[] args) {
        HashSet<String> isim = new HashSet<>();
        isim.add("mehmet");
        isim.add("Kemel");
        isim.add("Nuran");
        isim.add("Cemalettin");
        isim.forEach(item-> System.out.println(item));

    }
}
