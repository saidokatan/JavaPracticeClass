package do_while;

public class cift_tek_topla {
    public static void main(String[] args) {
        int cift = 0;
        int tek = 0;
        int baslangic = 4;
        do {
            if (baslangic % 2 == 0) {
                cift = cift + baslangic;
            } else
                tek = tek + baslangic;
            baslangic++;
        }
        while (baslangic < 20);
        System.out.println(cift);
        System.out.println(tek);

    }


}
