package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

public class ShapeClient {


    public static void main(String[] args) {
        Shape circle = new Circle(5.0);

        Shape rectangle = new Rectangle(6.0, 8.0);

        Shape triangle = new Triangle(3.0, 7.0);


        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        
    }
}
