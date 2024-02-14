import classes.*;

public class Main {
    public static void main(String[] args) {
        Quad quad = new Quad("Quad", "Yellow", new Point[]{new Point(100, 100), new Point(100, 150)}, 2, "Green");
        quad.draw();

        Circle circle = new Circle("Circle", "Skyblue", new Point[]{new Point(100, 100), new Point(200, 120)}, 2, "Yellow");
        circle.draw();

        Line line = new Line("Line", "Green", new Point[]{new Point(100, 100), new Point(200, 120), new Point(200, 120)});
        line.draw();

        Rectangle rectangle = new Rectangle("Rectangle", "Brown", new Point[]{new Point(2, 1), new Point(2, 6), new Point(9, 6), new Point(9, 1)}, 1, "Yellow");
        rectangle.draw();

        Qube qube = new Qube("Qube", "Green", new Point[]{new Point(100, 100), new Point(100, 150)}, 2, "Brown");
        qube.draw();
    }
}