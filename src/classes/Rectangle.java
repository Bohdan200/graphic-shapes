package classes;

import constants.Figures;
import interfaces.Areable;

public class Rectangle extends Shape implements Areable {
    private final float area;
    public Rectangle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.area = getArea();
        this.setBorderWidth(borderWidth);
        this.setBorderColor(borderColor);
    }

    public float getArea() {
        Point firstPoint = getCoords()[0];
        Point thirdPoint = getCoords()[1];
        return Math.abs((thirdPoint.getX() - firstPoint.getX()) * (thirdPoint.getY() - firstPoint.getY()));
    }

    public String draw() {
        String result = super.draw();
        return result + " area of the figure " + this.getName() + " = " + area + ";";
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Figures rectangle = Figures.RECTANGLE;
        System.out.println(rectangle.getValue());
    }
}