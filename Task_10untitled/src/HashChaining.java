import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashChaining {
    private class Node {
        private int key;
        private String value;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private int counter = 0;
    private LinkedList<Node>[] table;

    public HashChaining(int value) {
        if (value>0){
        table = new LinkedList[value];}
        else {
            System.out.println("invalid input");
        }
    }

    public int size() {
        return counter;

    }

    private int Hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
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

    public String get(int key) {
        int index = Hash(key);
        if (table[index] == null) {
            return "there is no value";
        } else {
            for (Node node : table[index]) {
                if (node.key == key)
                    return node.value;
            }
        }
        return null;

    }

    public void remove(int key) {
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
