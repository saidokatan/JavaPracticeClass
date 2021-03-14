package hashset;

import java.util.HashSet;

public class sehirler {
    public static void main(String[] args) {
        HashSet<String> sehir = new HashSet<>();
        sehir.add("Ankara");
        sehir.add("Istanbul");
        sehir.add("Kirikkale");
        System.out.println(sehir.size());
    }
}
