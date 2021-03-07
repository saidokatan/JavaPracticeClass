package for_each_loop;

import java.util.ArrayList;

public class kullanimi {
    public static void main(String[] args) {
        ArrayList<String> isim_list=new ArrayList<>();
        isim_list.add("ali");
        isim_list.add("veli");
        isim_list.add("mehmet");
        for(String str:isim_list){
            System.out.println(str);
        }
    }
}
