package classes;

import constants.Figures;
import interfaces.Areable;

public class Circle extends Shape implements Areable {
    private final float radius;
    private final float area;

    public Circle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.setBorderWidth(borderWidth);
        this.setBorderColor(borderColor);
        this.radius = getSide();
        this.area = getArea();
    }

    public float getSide() {
        Point firstPoint = getCoords()[0];
        Point secondPoint = getCoords()[1];
        return (float) Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2) + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
    }

    public float getArea() {
        return (float) (3.14159265 * Math.pow(radius, 2));
    }

    public String draw() {
        String result = super.draw();
        return result + " area of the figure " + this.getName() + " = " + area + "; radius = " + radius + ";";
    }
}
class CircleTest {
    public static void main(String[] args) {
        Figures circle = Figures.CIRCLE;
        circle.getValue();
    }
}