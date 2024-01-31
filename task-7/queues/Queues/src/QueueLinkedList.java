import java.util.NoSuchElementException;

public class QueueLinkedList {
    private class Node {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private int length;
    private Node first, end;

    public QueueLinkedList() {
        first = null;
        end = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (length == 1) {
            first = end = null;
            length = 0;
        } else {
            first = first.next;
            length--;
        }
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (length == 0) {
            first = end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        length++;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return first.item;
        }
    }

    public void print() {
        Node current = first.next;
        Node firstElement = first;
        System.out.print("[" + firstElement.item);
        while (current != null) {
            System.out.print("," + current.item);
            current = current.next;
        }
        System.out.print("]" + "\n");
    }
}







