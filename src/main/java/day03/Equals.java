package day03;

public class Equals {
    public static void main(String[] args) {
        String str = new String("hello");
        System.out.println(str.equals(str));
        System.out.println(str.equals("hello"));
        System.out.println((str=="hello"));
    }
}
