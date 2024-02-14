package classes;

import interfaces.Colorable;
import interfaces.Coordinable;
import interfaces.Surface;

import java.util.Objects;

public class Point implements Surface, Colorable, Coordinable {
    public float x;
    public float y;
    public String color = "Black";

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Draw a point by coordinates: x= " + x + ", y = " + y + " with color " + color + ";" );
    }
}

class PointTest {
    public static void main(String[] args) {
        Point point = new Point(4, 9);
        point.setColor("Green");
        point.draw();
    }
}