package interfaces;

public interface Drawable extends Surface, Borderable, Colorable {
    String getName();
    void setName(String name);
}
