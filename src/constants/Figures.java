package constants;

import classes.*;
public enum Figures {
    LINE(new Line("Line", "Green", new Point[]{new Point(100, 100), new Point(200, 120)})),
    CIRCLE(new Circle("Circle", "Skyblue", new Point[]{new Point(100, 100), new Point(200, 120)}, 2, "Yellow")),
    QUAD(new Quad("Quad", "Yellow", new Point[]{new Point(100, 100), new Point(100, 150)}, 2, "Green")),
    QUBE(new Qube("Qube", "Green", new Point[]{new Point(100, 100), new Point(100, 150)}, 2, "Brown")),
    RECTANGLE(new Rectangle("Rectangle", "Brown", new Point[]{new Point(2, 1), new Point(2, 6), new Point(9, 6), new Point(9, 1)}, 1,"Yellow")),
    RHOMBUS(new Rhombus("Rhombus", "Blue", new Point[]{new Point(30, 30), new Point(60, 30)}, 3, "Orange")),
    TRIANGLE(new Triangle("Triangle", "Orange", new Point[]{new Point(1, 1), new Point(6, 4), new Point(8, 2)}, 2, "Blue"));

    private final Shape shape;

    Figures(Shape shape) {
        this.shape = shape;
    }

    public String getValue() {
        return shape.draw();
    }

    public void setColor(String color) {
        shape.setColor(color);
    }
    public void setColor(int color) {
        shape.setColor(color);
    }

    public String getColor() {return shape.getColor(); }
}

