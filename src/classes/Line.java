package classes;
public class Line extends Shape {
    protected float side;
    public Line(String name, String color, Point[] coords) {
        super(name, color, coords, 0, "None");
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.side = getSide();

    }

    public float getSide() {
      return (float) Math.sqrt(Math.pow((coords[1].x - coords[0].x), 2) + Math.pow((coords[1].y - coords[0].y), 2));
    }
}

class LineTest {
    public static void main(String[] args) {
        Line line = new Line("Line", "Green", new Point[]{new Point(100, 100), new Point(200, 120), new Point(200, 120)});
        line.draw();
    }
}