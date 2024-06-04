package edu.geometry;

public class Triangle implements Shape {


    public final double base;

    public final double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }




}
