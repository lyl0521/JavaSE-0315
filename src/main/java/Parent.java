public class Parent {

    {
        System.out.println("parent constructor block 3");
    }

    static {
        System.out.println("parent static block  1");
    }

    public Parent() {
        System.out.println("parent constructor 2");
    }
}

class Child extends Parent {

    {
        System.out.println("child constructor block 4");
    }

    static {
        System.out.println("child static block 6");
    }

    public Child() {
        System.out.println("child constructor 7");
    }
}

class Test {
    public static void main(String[] args) {
        new Child();
    }
}