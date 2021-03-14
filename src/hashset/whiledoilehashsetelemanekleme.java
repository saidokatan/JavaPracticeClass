package hashset;

import java.util.HashSet;

public class whiledoilehashsetelemanekleme {
    public static void main(String[] args) {
        HashSet<Integer> sayi_ekle = new HashSet<>();
        int i = 1;
        while (i < 51) {
            sayi_ekle.add(i);
            i++;
        }
        System.out.println(sayi_ekle);
    }
}
