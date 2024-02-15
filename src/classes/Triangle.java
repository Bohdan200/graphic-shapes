package classes;

import interfaces.Areable;
import constants.Figures;

public class Triangle extends Shape implements Areable {
    private final float area;

    public Triangle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.area = getArea();
    }

    public float getArea() {
        // S=1/2 |(x1 – x2)(y1 + y2) +(x2 – x3)(y2 + y3) + (x3 – x1)(y3 + y1)|
        float sumTops1 = (coords[0].x - coords[1].x) * (coords[0].y + coords[1].y);
        float sumTops2 = (coords[1].x - coords[2].x) * (coords[1].y + coords[2].y);
        float sumTops3 = (coords[2].x - coords[0].x) * (coords[2].y + coords[0].y);
        return Math.abs(sumTops1 + sumTops2 + sumTops3) / 2;
    }

    public void draw() {
        super.draw();
        System.out.println("Area of the figure " + name + " = " + area + ";");
    }
}

class TriangleTest {
    public static void main(String[] args) {
        Figures triangle = Figures.TRIANGLE;
        triangle.getValue();
    }
}