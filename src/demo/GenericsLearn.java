package demo;

import model.Circle;
import model.Rectangular;
import model.Shape;

public class GenericsLearn{
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangular rectangular = new Rectangular(2, 3);
        ShapeCalculator shapeCalculator1 = new ShapeCalculator<Circle>(circle);
        ShapeCalculator shapeCalculator2 = new ShapeCalculator<Rectangular>(rectangular);
        System.out.println(shapeCalculator1.calculateArea() + "--" + shapeCalculator1.calculatePerimeter());
        System.out.println(shapeCalculator2.calculateArea() + "--" + shapeCalculator2.calculatePerimeter());
    }
}

class ShapeCalculator <T extends Shape> {
    T shape;

    public ShapeCalculator(T shape) {
        this.shape = shape;
    }

    public float calculateArea(){
        if (shape instanceof Rectangular){
            float firstEdge = ((Rectangular) shape).getFirstEdge();
            float secondEdge = ((Rectangular) shape).getSecondEdge();
            return firstEdge * secondEdge;
        }
        if (shape instanceof Circle) {
            float radius = ((Circle) shape).getRadius();
            return ((Circle) shape).getPi() * ((Circle) shape).getPi() * radius;
        }
        return -100;
    }
    public float calculatePerimeter(){
        if (shape instanceof Rectangular){
            float firstEdge = ((Rectangular) shape).getFirstEdge();
            float secondEdge = ((Rectangular) shape).getSecondEdge();
            return 2 * (firstEdge + secondEdge);
        }
        if (shape instanceof Circle) {
            float radius = ((Circle) shape).getRadius();
            return 2 * ((Circle) shape).getPi() * radius;
        }
        return -100;
    }
}
