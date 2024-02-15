package classes;

import constants.Colors;
import interfaces.Colorable;
import interfaces.Coordinable;
import interfaces.Surface;

import java.util.Objects;

public class Point implements Surface, Colorable, Coordinable {
    protected float x;
    protected float y;
    private String color = "Black";

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public void setColor(String color) {
        for (Colors value : Colors.values()) {
            if (color.equals(value.getCurrentColor())) {
                this.color = color;
                break;
            }
        }
    }

    public void setColor(int color) {
        for (Colors value : Colors.values()) {
            if (color == value.getIndexColor()) {
                this.color = value.getCurrentColor();
                break;
            }
        }
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Draw a point by coordinates: x= " + x + ", y = " + y + " with color " + color + ";" );
    }
}

class PointTest {
    public static void main(String[] args) {
        Point point = new Point(4, 9);
        point.setColor(8);
        point.setColor("Green");
        point.draw();
    }
}