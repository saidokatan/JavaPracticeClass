package on_bes_mart_oops_pratik;

import java.util.Scanner;

public class girilen_num_sayilari_kelime_il_soyle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phone = scan.nextLine();
        String [] arr = phone.split("");
        char [] arr2 = phone.toCharArray();
        //System.out.println(Arrays.toString(arr));
        for(String w: arr) {
            switch (w) {
                case "0" : System.out.print("Sıfır ");break;
                case  "1" : System.out.print("Bir ");break;
                case  "2" : System.out.print("İki ");break;
                case  "3" : System.out.print("Uc ");break;
                case  "4" : System.out.print("Dort ");break;
                case  "5" : System.out.print("Bes ");break;
                case  "6" : System.out.print("Altı ");break;
                case  "7" : System.out.print("Yedi ");break;
                case  "8" : System.out.print("Sekiz ");break;
                case  "9" : System.out.print("Dokuz ");break;
            }
        }

    }
}
