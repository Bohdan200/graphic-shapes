package classes;

import constants.Figures;
import interfaces.Areable;

public class Circle extends Shape implements Areable {
    private final float radius;
    private final float area;

    public Circle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.radius = getSide();
        this.area = getArea();
    }

    public float getSide() {
        return (float) Math.sqrt(Math.pow((coords[1].x - coords[0].x), 2) + Math.pow((coords[1].y - coords[0].y), 2));
    }

    public float getArea() {
        return (float) (3.14159265 * Math.pow(radius, 2));
    }

    public void draw() {
        super.draw();
        System.out.println("Area of the figure " + name + " = " + area + "; radius = " + radius + ";");
    }
}
class CircleTest {
    public static void main(String[] args) {
        Figures circle = Figures.CIRCLE;
        circle.getValue();
    }
}