package model;

public class Circle implements Shape {
    float radius;
    final float pi = 3;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public float getRadius() {
        return radius;
    }

    public float getPi() {
        return pi;
    }
}