package for_each_loop;

import java.util.ArrayList;

public class silme {
    public static void main(String[] args) {
        ArrayList<String> gun = new ArrayList<>();
        gun.add("musa");
        gun.add("Erdinc");
        gun.add("Kemal");
        gun.add("mus");
        for (String str : gun) {
            if (gun.size() < 4) {
                gun.remove(str);
            }
            }
        for (int i = 0; i < gun.size(); i++) {
            System.out.println(gun.get(i));
        }
        }
    }
