package day01;

public class question {
    public static void main(String[] args) {

        /*x değişkeni tanımlayıp 100 degerini assign edelim
           Y değişkeni tanımlayıp 10 degerini assign edelim
               Sonuç olarak
	 x ve y nin toplamı =
	x ve y nin farkı =
	x in y den bolumunden kalanı

	veren programı yazalım

         */
        int x = 10;
        int y = 100;
        int z = x + y;
        int l = x - y;
        int m = x % y;

        System.out.println("toplam..:" + z);
        System.out.println("farki..>"+ l);
        System.out.println("kalan..>"+m);
    }
}
