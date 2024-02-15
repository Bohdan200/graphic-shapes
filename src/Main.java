import constants.Figures;

public class Main {
    public static void main(String[] args) {
        for (Figures shape : Figures.values()) {
            shape.getValue();
        }
        // 5 - Orange
        Figures qube = Figures.QUBE;
        qube.setColor("Yellow");
        qube.setColor(5);
        qube.getValue();
    }
}