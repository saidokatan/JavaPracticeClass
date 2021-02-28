package arrays;

public class array_kolonlama {
    public static void main(String[] args) {
        String[] birinci_dizi = {"a", "b", "c", "d"};
        String[] ikinci_dizi = new String[4];
        ikinci_dizi = birinci_dizi.clone();
        for (int i = 0; i < ikinci_dizi.length; i++) {
            System.out.println((i + 1) + " .eleman " + ikinci_dizi[i]);


        }
    }
}
