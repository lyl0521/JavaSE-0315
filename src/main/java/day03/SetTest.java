package day03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        Iterator<String> ite = set.iterator();
        while (ite.hasNext()){
            String str = ite.next();
            System.out.println(str);
        }

    }
}
