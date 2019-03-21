package day03;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("hello");
        strings.add("hi");

        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }


    }
}
