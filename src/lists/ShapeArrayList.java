package lists;

import java.util.StringJoiner;

public class ShapeArrayList<T> {
    private static final int INIT_SIZE = 7;

    private Object[] data;
    private int index;

    public ShapeArrayList() {
        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resizeIfNeed();

        data[index] = value;
        index++;
    }

    private void resizeIfNeed() {
        if (index == data.length) {

            System.out.println("Resize happened, index: " + index + ", data.length: " + data.length);
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int i) {
        return (T) data[i];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(data[i].toString());
        }

        return "[" + result + "]";
    }
}
