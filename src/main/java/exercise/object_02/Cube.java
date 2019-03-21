package exercise.object_02;

import sun.security.util.Length;

public class Cube {

    private double length;
    private double height;
    private double weight;

    public Cube(){

    }

    public Cube(double length, double height, double weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public double getVolume(){
        return length*weight*height;
    }
}
