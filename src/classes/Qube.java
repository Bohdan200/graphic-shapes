package classes;

import interfaces.Areable;

// Куб - 3 одинаковых стороны
public class Qube extends Shape implements Areable {
    public int side;
    protected float area;

    public Qube(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.side = getSide();
        this.area = getArea();
    }

    public int getSide() {
        return (int) Math.sqrt(Math.pow((coords[1].x - coords[0].x), 2) + Math.pow((coords[1].y - coords[0].y), 2));
    }

    public float getArea() {
        return side * side * side;
    }

    public void draw() {
        super.draw();
        System.out.println("Area of the figure " + name + " = " + area + "; side = " + side + ";");
    }
}

class QubeTest {
    public static void main(String[] args) {
        Qube qube = new Qube("Qube", "Green", new Point[]{new Point(100, 100), new Point(100, 150)}, 2, "Brown");
        qube.draw();
    }
}