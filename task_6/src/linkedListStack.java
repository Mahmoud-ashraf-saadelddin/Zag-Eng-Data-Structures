import java.util.NoSuchElementException;

public class linkedListStack {
    private class Node {
        int value;
        Node bottom;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node n = new Node(value);
        n.bottom = top;
        top = n;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return top.value;
    }

    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException();
        Node temp = top;
        top = top.bottom;
        temp.bottom = null;
        return temp.value;
    }
}
