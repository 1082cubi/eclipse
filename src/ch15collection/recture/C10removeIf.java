package ch15collection.recture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        set.removeIf(e -> e.equals("css"));

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (item.equals("jsp")) {
////                iterator.remove();
//                set.remove(item);
//            }
//        }
        System.out.println("set = " + set);
    }
}
