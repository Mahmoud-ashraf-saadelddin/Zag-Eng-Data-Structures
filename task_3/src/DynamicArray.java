public class DynamicArray {
    private int[] arr;
    private int size = 0;
    private int item = 0;

    public DynamicArray(int m) {
        size = m;
        arr = new int[size];

    }

    public DynamicArray() {
        size = 100;
        arr = new int[size];
    }

    public void printArray() {
        for (int i = 0; i < item; i++) {
            System.out.println(arr[i]);
        }
    }

    public void insert(int num) {
        if (item == size) {
            int[] arr3 = new int[size + 10];
            copyArray(arr, arr3);
            arr = arr3;
        }
        arr[item] = num;
        item++;
    }

    public void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < item; i++) {
            arr2[i] = arr1[i];
        }

    }

    public void removeAt(int index) {
        if (index > 0 && index < item) {
            for (int i = index; i < item - 1; i++) {
                arr[i] = arr[i + 1];
            }
            item--;
        } else System.out.println("wrong input");

    }

    public void indexOf(int value) {
        for (int i = 0; i < item; i++) {
            if (arr[i] == value) {
                removeAt(i);
            }
        }
    }

    public int at(int index) {
        if (0 <= index && index < item) {
            return arr[index];
        } else return -1;
    }

    public int max() {
        int max = arr[0];
        for (int i = 0; i < item; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 0; i < item; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void remove(int value) {
        for (int i = 0; i < item; i++) {
            if (arr[i] == value) {
                removeAt(i);
            }
        }
    }

    public int indexOfElement(int value) {
        int index = 0;
        for (int i = 0; i < item; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
