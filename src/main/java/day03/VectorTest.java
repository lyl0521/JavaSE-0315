package day03;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();

        // 容量动态分配，每次超过容量上限，容量翻倍
        for (int i = 0; i < 20; i++) {
            strings.add("hello");
        }
        for (int i = 0; i <= 20; i++) {

        strings.add("hi");
        }

        System.out.println(strings.size());
        System.out.println(strings.capacity());

    }
}
