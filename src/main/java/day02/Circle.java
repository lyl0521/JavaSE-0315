package day02;

public class Circle {
    private double pi = 3.14;
    private double r ;

    public Circle(double r) {
        this.r = r;
    }

    public double Perimeter(){
        return 2 * pi * r;
    }

    public double Area(){
        return pi * r * r;
    }
}

class test1{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.Perimeter());
        System.out.println(circle.Area());
    }
}