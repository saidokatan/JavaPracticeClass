package string;

import java.util.Locale;

public class Up_down_and_lenght {
    public static void main(String[] args) {
        String name = "JAVA  Kursu";
        String name_1 = name.toLowerCase(Locale.ROOT);
        String name_2 = name.toUpperCase(Locale.ROOT);
        System.out.println("Normal Yazilim    " + name);
        System.out.println("Hepsi Kucuk Harflerle Yazim  " + name_1 + "    uzunluk  " + name_1.length());
        System.out.println("Hepsi Buyuk Harflerle yazim  " + name_2 + "    uzunluk " + name_2.length());


    }
}
