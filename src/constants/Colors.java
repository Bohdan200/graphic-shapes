package constants;

import java.util.Arrays;

public enum Colors {
    RED("Red", 1),
    BLUE("Blue", 2),
    YELLOW("Yellow", 3),
    GREEN("Green", 4),
    ORANGE("Orange", 5),
    BLACK("Black", 6),
    WHITE("White", 7),
    SKYBLUE("Skyblue", 8);
    private final String currentColor;
    private final Integer indexColor;

    Colors(String currentColor, Integer indexColor) {
        this.currentColor = currentColor;
        this.indexColor = indexColor;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public Integer getIndexColor() {
        return indexColor;
    }

    public String allColors() {
        return Arrays.toString(Colors.values());
    }
}
