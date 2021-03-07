package odevler_for_each;

public class string_array_ortak_eleman {
    public static void main(String[] args) {
        String[] str1 = {"okul", "duvar", "kapi", "tencere"};
        String[] str2 = {"ilk", "okul", "duvar", "kapi"};

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    System.out.println(str1[i]);

                }

            }
        }
    }
}