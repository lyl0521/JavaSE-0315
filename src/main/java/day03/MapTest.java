package day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Tom");
        map.put(2,"Jerry");
        map.put(3,"Allen");

        for (String value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> stringEntry : map.entrySet()) {
            System.out.println(stringEntry);
        }
        }
    }

