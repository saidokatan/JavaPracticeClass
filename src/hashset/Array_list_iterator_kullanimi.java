package hashset;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_iterator_kullanimi {
    public static void main(String[] args) {
        ArrayList<String> itt=new ArrayList<>();
        itt.add("Sen ");
        itt.add("Nasilsin ");
        itt.add("Iyimisin ");
        Iterator<String> list_it= itt.iterator();
        while(list_it.hasNext()){
            System.out.print(list_it.next());
        }
    }
}
