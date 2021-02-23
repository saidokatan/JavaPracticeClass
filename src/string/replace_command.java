package string;

public class replace_command {
    public static void main(String[] args) {
        String degisken = "Al-i Bu--gun Ja--va C--alisti";
        String degisken1 = degisken.replace("-", "");
        String degisken3 = degisken1.replaceFirst("i","s");
        System.out.println("Birinci Kelime...>  " + degisken);
        System.out.println("Degismis olan Kelime...>  " + degisken1);
        System.out.println("Ilk Degeri Degismis olan kelime...>  " + degisken3);

    }
}
