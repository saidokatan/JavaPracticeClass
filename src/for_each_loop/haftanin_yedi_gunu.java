package for_each_loop;

import java.util.ArrayList;
import java.util.Locale;

public class haftanin_yedi_gunu {
    public static void main(String[] args) {
        ArrayList<String> gun=new ArrayList<>();
        gun.add("Pazartesi");
        gun.add("Sali");
        gun.add("Carsamba");
        gun.add("persembe");
        gun.add("cuma");
        gun.add("cumartesi");
        gun.add("pazar");
        for (String str:gun){
            System.out.println(str.toLowerCase(Locale.ROOT));
        }
    }
}
