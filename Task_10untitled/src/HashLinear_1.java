import java.util.ArrayList;

public class HashLinear_1 {

    private static int DEFAULT_CAPACITY = 10;
    private static double LOAD_FACTOR_THRESHOLD = 0.7;

    private int size;
    private int capacity;
    private ArrayList<Node> table;
    private int count;

    private static class Node {
        private int key;
        private String value;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashLinear_1() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            table.add(null);
        }
        count = 0;
    }


    private int hash(int key) {
        return key % capacity;
    }

    private void resize() {
        int newCapacity = capacity * 2;
        ArrayList<Node> newTable = new ArrayList<>(newCapacity);
        for (int i = 0; i < newCapacity; i++) {
            newTable.add(null);
        }

        for (Node entry : table) {
            if (entry != null) {
                int index = hash(entry.key);
                while (newTable.get(index) != null) {
                    index = (index + 1) % newCapacity;
                }
                newTable.set(index, entry);
            }
        }

        table = newTable;
        capacity = newCapacity;
    }

    public void put(int key, String value) {
        if ((double) size / capacity > LOAD_FACTOR_THRESHOLD) {
            resize();
        }

        int index = hash(key);
        while (table.get(index) != null && table.get(index).key != key) {
            index = (index + 1) % capacity;
        }

        if (table.get(index) == null) {
            count++;
        }

        table.set(index, new Node(key, value));
        size++;
    }

    public String get(int key) {
        int index = hash(key);
        while (table.get(index) != null && table.get(index).key != key) {
            index = (index + 1) % capacity;
        }

        if (table.get(index) != null) {
            return table.get(index).value;
        }

        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        while (table.get(index) != null && table.get(index).key != key) {
            index = (index + 1) % capacity;
        }

        if (table.get(index) != null) {
            table.set(index, null);
            size--;
            count--; // Decrement count when an element is removed
        }
    }

    public int size() {
        return count;
    }
}
