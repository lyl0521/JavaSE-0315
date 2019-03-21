package day02;

public class StaticTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind("Tom", 19);

        tom.setAge(20);
        System.out.println(tom.getName());
        System.out.println(tom.getAge());

//        tom.setEarth("Tom 在天软种了一棵树。");
        Mankind.setEarth("Tom 在天软种了一棵树。");

        System.out.println(Mankind.getEarth()); // null

        Mankind jerry = new Mankind("jerry", 18);

        jerry.setName("Jerry");
        System.out.println(jerry.getName());
        System.out.println(jerry.getAge());

//        tom.setEarth("Tom在天软砍了一棵树。");

        System.out.println(tom.getEarth()); // null

//        Math math = new Math();
//                   static int = 0;
        System.out.println(Math.PI);
        System.out.println(Math.pow(2, 3));
    }
}


class Mankind { // 人类
    private String name;
    private int age;

    // static field
    private static String earth; // 地球

    public Mankind(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getEarth() {
        return earth;
    }

    public static void setEarth(String earth) {
        Mankind.earth = earth;
    }
}
