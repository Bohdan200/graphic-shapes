package classes;

import constants.Figures;
import interfaces.Areable;

public class Quad extends Shape implements Areable {
    private final float side;
    private final float area;

    public Quad(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.setBorderWidth(borderWidth);
        this.setBorderColor(borderColor);
        this.side = getSide();
        this.area = getArea();
    }

    public float getSide() {
        Point firstPoint = getCoords()[0];
        Point secondPoint = getCoords()[1];
        return (float) Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2) + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
    }

    public float getArea() {
        return side * side;
    }

    public String draw() {
        String result = super.draw();
        return result + " area of the figure " + this.getName() + " = " + area + "; side = " + side + ";";
    }
}

class QuadTest {
    public static void main(String[] args) {
        Figures quad = Figures.QUAD;
        System.out.println(quad.getValue());

        quad.setColor(5);
        System.out.println("quad.getColor() = " + quad.getColor());
    }
}