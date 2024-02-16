package classes;

import constants.Figures;
import interfaces.Areable;

public class Qube extends Shape implements Areable {
    private final int side;
    private final float area;

    public Qube(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        super(name, color, coords, borderWidth, borderColor);
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.setBorderWidth(borderWidth);
        this.setBorderColor(borderColor);
        this.side = getSide();
        this.area = getArea();
    }

    public int getSide() {
        Point firstPoint = getCoords()[0];
        Point secondPoint = getCoords()[1];
        return (int) Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2) + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
    }

    public float getArea() {
        return side * side * side;
    }

    public String draw() {
        String result = super.draw();
        return result + " area of the figure " + this.getName() + " = " + area + "; side = " + side + ";";
    }
}

class QubeTest {
    public static void main(String[] args) {
        Figures qube = Figures.QUBE;
        System.out.println(qube.getValue());
    }
}