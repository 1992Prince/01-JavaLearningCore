package com.easybytes.sec10inheritance.p4_instanceOfWithUpcastingPract;

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void radius() {
        System.out.println("Circle radius");
    }
}