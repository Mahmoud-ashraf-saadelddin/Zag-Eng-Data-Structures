import java.util.NoSuchElementException;

public class PriorityQueue {
    private int count = 0;
    private int arr[];

    public PriorityQueue(int size) {
        arr = new int[size];
    }

    public boolean isEmpity() {
        return count == 0;
    }

    public boolean isFull() {
        return count == arr.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new NoSuchElementException();
        } else {
            int place = wrightPlace(value);
            arr[place] = value;
            count++;
        }

    }

    public int enqueue() {
        if (isEmpity()) {
            throw new NoSuchElementException();
        } else {
            int temp = arr[0];
            for (int i=0; i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            count--;
            return temp;
        }
    }

    private int wrightPlace(int value) {
        int i = count - 1;
        for (; i >= 0; i--) {
            if (arr[i] > value) {
                arr[i + 1] = arr[i];
            } else break;

        }
        return i + 1;
    }
}
