package model;


public class Rectangular implements Shape {
    float firstEdge, secondEdge;

    public Rectangular(float firstEdge, float secondEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
    }

    public Rectangular() {
    }

    public float getFirstEdge() {
        return firstEdge;
    }

    public float getSecondEdge() {
        return secondEdge;
    }
}