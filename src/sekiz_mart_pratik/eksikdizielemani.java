package sekiz_mart_pratik;

import java.util.Arrays;

public class eksikdizielemani {
    public static void main(String[] args) {
        /*
Find Missing Number From Series/Array in Java
1’den 12’e kadar bir array tanımlayın ve bir rakam eksik atlanmış bunu nasıl bulursunuz
 int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
 */

                int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
                //Degiskeni yazdıralım
                System.out.println(Arrays.toString(numbers));
                int n = numbers[numbers.length-1];
                //System.out.println(n);
                //olması gereken toplam degeri bulduk
                int olması_gereken = n * (n+1) / 2;
                System.out.println("Olması gerejen toplam = " + olması_gereken);
                int toplam = 0;
                for (int w : numbers) {
                    toplam += w;
                }
                System.out.println("Dizinin toplamı = " + toplam);
                System.out.println("Eksik eleman = " + (olması_gereken - toplam));
    }
}
