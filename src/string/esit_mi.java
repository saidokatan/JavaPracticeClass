package string;

public class esit_mi {
    public static void main(String[] args) {
        String esitmi_1 = "Hello";
        String esitmi_2 = "hello";
        Boolean sonuc = esitmi_1.equals(esitmi_2);
        String sonucfarkli = (sonuc == true) ? " Esittir" : "Esit Degildir";
        System.out.println(esitmi_1.equals(esitmi_2));
        System.out.println("Sonuc.....>" + sonucfarkli);
    }
}
