import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        QueueArray q1 = new QueueArray();
//        q1.enqueue(1);
//        q1.enqueue(2);
//        q1.enqueue(3);
//        q1.enqueue(4);
//        System.out.println(q1.peek());
//        System.out.println(q1.size());
//        q1.print();
//        System.out.println(q1.dequeue());
//        q1.print();
//        reverseQueue(q1);
//        q1.print();


//        QueueStack q2 = new QueueStack();
//        q2.enqueue(5);
//        q2.enqueue(4);
//        q2.enqueue(3);
//        System.out.println(q2.size());
//        System.out.println(q2.dequeue());
//        System.out.println(q2.size());
//        System.out.println(q2.print());
        QueueLinkedList q3 = new QueueLinkedList();
        q3.enqueue(1);
        q3.enqueue(2);
        q3.enqueue(9);
        q3.enqueue(8);
        q3.enqueue(5);
        System.out.println(q3.peek());
        q3.print();
        q3.dequeue();
        q3.dequeue();
        q3.print();



    }

    public static void reverseQueue(QueueArray Q) {
        Stack<Integer> s = new Stack<>();
        while (!Q.isEmpity()){
            s.push(Q.dequeue());
        }
        while (!s.isEmpty()){
            Q.enqueue(s.pop());

        }
    }
}