package classes;

import constants.Figures;

public class Line extends Shape {
    private final float side;
    public Line(String name, String color, Point[] coords) {
        super(name, color, new Point[2], 0, "None");
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.side = getSide();

    }

    public float getSide() {
      return (float) Math.sqrt(Math.pow((coords[1].x - coords[0].x), 2) + Math.pow((coords[1].y - coords[0].y), 2));
    }

    public void draw() {
        super.draw();
        System.out.println("Side of the figure " + name + " = " + side + ";");
    }
}

class LineTest {
    public static void main(String[] args) {
        Figures line = Figures.LINE;
        line.getValue();
    }
}