package day02;

public class AbstractTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.Area());
    }
}

abstract class Shape{

    public abstract double Area();
    public abstract double Perimeter();
}



class Square extends Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double Area() {
        return length * length;
    }

    @Override
    public double Perimeter() {
        return 4 * length;
    }
}


