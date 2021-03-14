package hashset;

import java.util.HashSet;

public class hashset_to_array {
    public static void main(String[] args) {
        HashSet<String> cevir = new HashSet<>();

        cevir.add("Ali");
        cevir.add("ata");
        cevir.add("bak.");
        String Ali = null;
        String ata = null;
        String bak = null;
        long baslangic = System.currentTimeMillis();
        Object[] cevir_array = cevir.toArray();
        for (int i = 0; i < cevir_array.length; i++) {
            System.out.print(cevir_array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < cevir_array.length; i++) {
            if (cevir_array[i] == "Ali") {
                Ali = "Ali ";
            } else if (cevir_array[i] == "ata") {
                ata = "ata ";
            } else if (cevir_array[i] == "bak.") {
                bak = "bak.";
            }
        }
        long bitis = System.currentTimeMillis();
        long zaman = bitis - baslangic;
        System.out.println(zaman);
        System.out.println(Ali + ata + bak);
    }
}

