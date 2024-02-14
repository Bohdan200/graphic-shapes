package classes;

import interfaces.Areable;

public class Rectangle extends Shape implements Areable {
    public float area;
    public Rectangle(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.area = getArea();
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    public float getArea() {
        return Math.abs((coords[2].x - coords[0].x) * (coords[2].y - coords[0].y));
    }

    public void draw() {
        super.draw();
        System.out.println("Area of the figure " + name + " = " + area + ";");
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", "Brown", new Point[]{new Point(2, 1), new Point(2, 6), new Point(9, 6), new Point(9, 1)}, 1,"Yellow");
        rectangle.draw();
    }
}