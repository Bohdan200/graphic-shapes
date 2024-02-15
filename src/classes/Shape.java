package classes;

import interfaces.Drawable;
import constants.Colors;

import java.util.Arrays;

public class Shape implements Drawable {
    protected String name;
    protected Point[] coords;
    protected String color;
    protected float borderWidth;
    protected String borderColor;

    public Shape(String name, String color, Point[] coords, float borderWidth, String borderColor) {
        this.name = name;
        this.color = color;
        this.coords = coords;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCoords() {
        StringBuilder result = new StringBuilder();
        Point[] coordsCopy = Arrays.copyOf(coords, coords.length);
        for (int i = 0; i < coordsCopy.length; i++) {
            result.append("x").append(i).append(": ").append(coordsCopy[i].x).append(" ").append("y").append(i).append(": ").append(coordsCopy[i].y).append("; ");
        }
        return result.toString();
    }

    public void setCoords(Point[] coords) {
        this.coords = coords;
    }

    public float getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(float borderWidth) {
        this.borderColor = borderColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void draw() {
        System.out.println("Draw a figure with parameters: name: " + name + "; color: " + color + "; coordinates: " + getCoords() + "border width: " + borderWidth + "; border color: " + borderColor + ";");
    }
}
