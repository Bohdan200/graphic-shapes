import constants.Figures;
import lists.ShapeArrayList;

public class Main {
    public static void main(String[] args) {
        ShapeArrayList<String> list = new ShapeArrayList<>();

        for (Figures shape : Figures.values()) {
            System.out.println(shape.getValue());
            list.add(shape.getValue());
        }

        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));

        // 5 - Orange
        Figures qube = Figures.QUBE;
        qube.setColor("Yellow");
        qube.setColor(5);
        System.out.println("qube.getColor() = " + qube.getColor());
    }
}