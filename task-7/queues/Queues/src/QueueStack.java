import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    private int count = 0;
    public boolean isEmpity() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public boolean isfull() {
        return !s1.isEmpty() && !s2.isEmpty();
    }

    public int size() {
        return count;
    }

    private void exchange() {
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }

    public void enqueue(int item) {
        s1.push(item);
        count++;
    }

    public int dequeue() {
        if (isEmpity())
            throw new NoSuchElementException();

        if (s2.isEmpty())
            exchange();

        count--;
        return s2.pop();

    }

    public int peek() {
        if (isEmpity())
            throw new NoSuchElementException();

        if (s2.isEmpty())
            exchange();

        return s2.peek();

    }
    public Stack<Integer> print(){
        reverseExchange();
        return s1;
    }

    private void reverseExchange() {
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }


}
