package day03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("hi");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
