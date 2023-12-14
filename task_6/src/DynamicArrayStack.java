import java.util.NoSuchElementException;

public class DynamicArrayStack {
    private int[] arr;
    private int size;
    private int arr_numbers = 0;

    public DynamicArrayStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public DynamicArrayStack() {
        size = 100;
        arr = new int[size];
    }

    public void push(int num) {
        if (size == arr_numbers) {
            resize();
        }
        arr[arr_numbers] = num;
        arr_numbers++;
    }

    public int peek() {
        if (arr_numbers == 0)
            throw new NoSuchElementException();

        return arr[arr_numbers - 1];
    }

    public int pop() {
        if (arr_numbers == 0)
            throw new NoSuchElementException();
        arr_numbers--;
        return arr[arr_numbers];
    }

    private void resize() {
        size = size * 2;
        int[] newArr = new int[size];
        for (int i = 0; i < arr_numbers; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public boolean isEmpty() {
        return arr_numbers == 0;
    }

}
