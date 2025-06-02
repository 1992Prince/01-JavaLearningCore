package com.easybytes.sec10inheritance.p4_instanceOfWithUpcastingPract;

public class CircleUtility {

    public static void drawShape(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.radius();  // Specific method for Circle
        }
        shape.draw();  // Polymorphic call to draw
    }
}
