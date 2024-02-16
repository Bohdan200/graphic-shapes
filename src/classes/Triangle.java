package classes;

import interfaces.Areable;
import constants.Figures;

public class Triangle extends Shape implements Areable {
    private final float area;

    public Triangle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.setBorderWidth(borderWidth);
        this.setBorderColor(borderColor);
        this.area = getArea();
    }

    public float getArea() {
        // S=1/2 |(x1 – x2)(y1 + y2) +(x2 – x3)(y2 + y3) + (x3 – x1)(y3 + y1)|
        Point firstPoint = getCoords()[0];
        Point secondPoint = getCoords()[1];
        Point thirdPoint = getCoords()[2];
        float sumTops1 = (firstPoint.getX() - secondPoint.getX()) * (firstPoint.getY() + secondPoint.getY());
        float sumTops2 = (secondPoint.getX() - thirdPoint.getX()) * (secondPoint.getY() + thirdPoint.getY());
        float sumTops3 = (thirdPoint.getX() - firstPoint.getX()) * (thirdPoint.getY() + firstPoint.getY());
        return Math.abs(sumTops1 + sumTops2 + sumTops3) / 2;
    }

    public String draw() {
        String result = super.draw();
        return result + " area of the figure " + this.getName() + " = " + area + ";";
    }
}

class TriangleTest {
    public static void main(String[] args) {
        Figures triangle = Figures.TRIANGLE;
        System.out.println(triangle.getValue());
    }
}