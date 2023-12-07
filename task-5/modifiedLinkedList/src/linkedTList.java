import java.util.NoSuchElementException;

public class linkedTList<T> {

    class Node {
        T value;
        Node nextnode;

        public Node(T value) {
            this.value = value;   // n =1
        }

        public Node() {

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = tail = node;        // O(n)=1
        } else {
            node.nextnode = head;
            head = node;
        }
        size++;
    }

    public void addLast(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.nextnode = node;   // O(n)=1
            tail = node;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null)
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;     // O(n)=1
            head = head.nextnode;
            temp.nextnode = null;

        }
        size--;
    }

    public void removrLast() {
        if (head == null)
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;              //O(n)=n
        } else {
            Node before = beforeLast();
            tail = before;
            tail.nextnode = null;
        }
        size--;

    }

    private Node beforeLast() {
        Node before = head;
        Node current = head;
        while (current.nextnode != null) {
            before = current;
            current = current.nextnode;          //O(n)=n

        }
        return before;
    }

    public int indexOf(T m) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == m)
                return index;                 // O(n) =n
            index++;
            current = current.nextnode;
        }
        return -1;
    }

    public boolean contain(T value) {
        Node first = head;
        while (first != null) {
            if (first.value == value) {        //O(n)=n
                return true;
            }
            first = first.nextnode;
        }
        return false;
    }

    public int size() {
        return size;     //O(n)=1
    }

    public void printElements() {
        Node m = head;
        while (m != null) {
            System.out.println(m.value);   //O(n)=n
            m = m.nextnode;
        }
    }

    public void reverse() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node previous = head;
        Node current = head.nextnode;
        while (current != null) {
            Node next = current.nextnode;      // O(n)
            current.nextnode = previous;
            previous = current;
            current = next;

        }
        Node temp = head;
        head = tail;
        tail = temp;
        tail.nextnode = null;

    }
}
