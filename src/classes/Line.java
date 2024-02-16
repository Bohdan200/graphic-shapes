package classes;

import constants.Figures;

public class Line extends Shape {
    private final float side;

    public Line(String name, String color, Point[] coords) {
        super(name, color, coords, 0, "None");
        this.setName(name);
        this.setColor(color);
        this.setCoords(coords);
        this.side = getSide();

    }

    public float getSide() {
        Point firstPoint = getCoords()[0];
        Point secondPoint = getCoords()[1];
      return (float) Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2) + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
    }

    public String draw() {
        String result = super.draw();
        return result + " side of the figure " + this.getName() + " = " + side + ";";
    }
}

class LineTest {
    public static void main(String[] args) {
        Figures line = Figures.LINE;
        System.out.println(line.getValue());
    }
}