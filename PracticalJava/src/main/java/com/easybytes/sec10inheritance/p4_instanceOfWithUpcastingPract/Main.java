package com.easybytes.sec10inheritance.p4_instanceOfWithUpcastingPract;

import static com.easybytes.sec10inheritance.p4_instanceOfWithUpcastingPract.CircleUtility.drawShape;

public class Main {

    public static void main(String[] args) {

        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();
        Shape mySquare = new Square();

        drawShape(myCircle);
        drawShape(myRectangle);
        drawShape(mySquare);

        /*
        Circle radius
        Drawing a circle
        Drawing a rectangle
        Drawing a shape
         */
    }
}
