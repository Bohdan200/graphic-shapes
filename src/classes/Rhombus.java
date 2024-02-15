package classes;

import constants.Figures;
import interfaces.Areable;

public class Rhombus extends Shape implements Areable {
    private final float side;
    private final float area;


    public Rhombus(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.side = getSide();
        this.area = getArea();
    }

    public float getSide() {
        return (float) Math.sqrt(Math.pow((coords[1].x - coords[0].x), 2) + Math.pow((coords[1].y - coords[0].y), 2));
    }

    public float getArea() {
        return side * side;
    }

    public void draw() {
        super.draw();
        System.out.println("Area of the figure " + name + " = " + area + "; side = " + side + ";");
    }
}

class RhombusTest {
    public static void main(String[] args) {
        Figures rhombus = Figures.RHOMBUS;
        rhombus.getValue();
    }
}