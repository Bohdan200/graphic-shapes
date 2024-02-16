package classes;

import interfaces.Drawable;
import constants.Colors;

import java.util.Arrays;

public class Shape implements Drawable {
    private String name;
    private Point[] coords;
    private String color;
    private float borderWidth;
    private String borderColor;

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

    public Point[] getCoords() {
        return Arrays.copyOf(coords, coords.length);
    }

    public void setCoords(Point[] coords) {
        this.coords = coords;
    }

    public float getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(float borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String draw() {
        StringBuilder shapeCoords = new StringBuilder();
                for (int i = 0; i < getCoords().length; i++) {
                    shapeCoords.append("x").append(i).append(": ").append(getCoords()[i].getX()).append(" ").append("y").append(i).append(": ").append(getCoords()[i].getY()).append("; ");
        }

        return "Draw a figure with parameters: name: " + name + "; color: " + color + "; coordinates: " + shapeCoords.toString() + "border width: " + borderWidth + "; border color: " + borderColor + ";";
    }
}
