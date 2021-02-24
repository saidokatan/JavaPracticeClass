package string;

public class ireri_2 {
    public static void main(String[] args) {
        String elma = "Elma";
        String armut = "armut";
        String ceviz = "Ceviz";
        boolean elma_icerir = elma.contains("a");
        boolean armut_icerir = armut.contains("a");
        boolean ceviz_cerir = ceviz.contains("a");
        System.out.println(elma + " a " + elma_icerir);
        System.out.println(armut + " a " + armut_icerir);
        System.out.println(ceviz + " a " + ceviz_cerir);
        if (elma_icerir) {
            System.out.println( " Elma yazisinda a vadir");
        } else {
            System.out.println("elma yazisinda a yoktur.");
        }
        if (armut_icerir) {
            System.out.println( " Armut yazisinda a vadir");
        }else {
            System.out.println(" Armut yazisinda a yoktur.");
        }
        if (ceviz_cerir) {
            System.out.println( " Ceviz yazisinda a vadir");
        }else {
            System.out.println(" Ceviz yazisinda a yoktur.");
        }
    }
}
