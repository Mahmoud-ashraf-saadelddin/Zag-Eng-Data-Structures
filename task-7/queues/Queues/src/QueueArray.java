import java.util.NoSuchElementException;

public class QueueArray {
    private int arr[];
    private int first = 0;
    private int count = 0;
    private int last = 0;
    private int size = 0;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public QueueArray() {
        size = 5;
        arr = new int[size];
    }

    public boolean isEmpity() {
        return count == 0;

    }

    public boolean isFull() {
        return count == size;

    }

    public int size() {
        return count;
    }

    public void enqueue(int element) {
        if (isFull())
            throw new NoSuchElementException();

        arr[last] = element;
        last = (last + 1) % size;
        count++;

    }

    public int dequeue() {
        int temp = arr[first];
        if (isEmpity()) {
            throw new NoSuchElementException();
        } else {
            first = (first + 1) % size;
            count--;
        }
        return temp;
    }

    public int peek() {
        return arr[first];
    }

    public void print() {
        System.out.print("[");
        if (isEmpity()) {
            throw new NoSuchElementException("NO elements to print");
        } else {
            System.out.print(arr[first]);
            int current = (first + 1) % size;
            while (current != last) {
                System.out.print("," + arr[current]);
                current = (current + 1) % size;
            }

        }
        System.out.print("]" + "\n");

    }

}
