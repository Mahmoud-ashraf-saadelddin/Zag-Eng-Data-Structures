import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashChaning<k, v> {
    private class Node {
        private k key;
        private v value;

        Node(k key, v value) {
            this.key = key;
            this.value = value;
        }

    }

    private int counter = 0;
    private LinkedList<Node>[] table;

    public HashChaning(v value) {
        if (value.hashCode() > 0) {
            table = new LinkedList[value.hashCode()];
        } else {
            System.out.println("invalid input");
        }
    }

    public int size() {
        return counter;

    }

    private int Hash(k key) {
        return key.hashCode() % table.length;
    }

    public void put(k key, v value) {
        Node node = new Node(key, value);
        int index = Hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        table[index].add(node);
        counter++;

        for (Node node1 : table[index]) {
            if (node1.key == key)
                node1.value = value;
            return;
        }
    }

    public v get(k key) {
        int index = Hash(key);
        if (table[index] == null) {
            return null;
        } else {
            for (Node node : table[index]) {
                if (node.key == key)
                    return node.value;
            }
        }
        return null;

    }

    public void remove(k key) {
        int index = Hash(key);
        if (table[index] == null)
            throw new NoSuchElementException();
        else {
            for (Node node : table[index]) {
                if (node.key == key) {
                    table[index].remove(node);
                    counter--;
                    return;

                }

            }

        }
        throw new NoSuchElementException();
    }

}
