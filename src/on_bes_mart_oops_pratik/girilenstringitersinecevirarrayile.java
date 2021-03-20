package on_bes_mart_oops_pratik;

import java.util.Scanner;

public class girilenstringitersinecevirarrayile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String str = scan.next();
        char [] arr = str.toCharArray();
        //System.out.println(Arrays.toString(arr));
        String ters = "";
        for (int i = str.length()-1; i>=0; i--) {
            ters += str.charAt(i);
        }
        System.out.println("Kelimenin tersi: " + ters);
    }
}
