package for_each_loop;

import java.util.ArrayList;

public class silme {
    public static void main(String[] args) {
        ArrayList<String> gun = new ArrayList<>();
        gun.add("mu");
        gun.add("Erdinc");
        gun.add("Kemal");
        gun.add("mus");
        final boolean b = gun.removeIf(gunler -> gunler.length() < 4);
        for (int i = 0; i < gun.size(); i++) {
            System.out.println(gun.get(i));
        }
    }
}
