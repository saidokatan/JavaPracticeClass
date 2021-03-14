package hashset;

import java.util.HashSet;

public class addtohashset {
    public static void main(String[] args) {
        HashSet<String> isim1 = new HashSet<>();
        HashSet<String> isim2 = new HashSet<>();
        HashSet<String> total = new HashSet<>();
        isim1.add("mehmet");
        isim1.add("Kemel");
        isim1.add("Nuran");
        isim1.add("nuri");
        isim2.add("mehmet");
        isim2.add("Niyazi");
        isim2.add("Nuran");
        isim2.add("nizam");
        total.addAll(isim1);
        total.addAll(isim2);
        System.out.println(total);


    }
}
