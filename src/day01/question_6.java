package day01;

public class question_6 {
    public static void main(String[] args) {
 /*
     a = 4
                       b = 5
                       c = 3
 ucgenin kenar uzunlukları veriliyor eşkenar mı değil mi kontrol edelim
  */
        int a = 3;
        int b = 3;
        int c = 3;
        boolean d = (a == b) && (a == c) && (b == c);
        System.out.println("sonuc..>" + d);

    }
}
