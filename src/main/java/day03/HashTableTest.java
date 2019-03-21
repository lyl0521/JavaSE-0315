package day03;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(1,"Tom");
        hashtable.put(2,"Jerry");
        hashtable.put(3,"Allen");

        for (String value : hashtable.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry);
        }
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer);
        }
    }
}
