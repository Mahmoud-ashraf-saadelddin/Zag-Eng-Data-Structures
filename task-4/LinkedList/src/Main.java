public class Main {
    public static void main(String[] args) {
        LinkedList1 k = new LinkedList1();
        k.addFirst(9);
        k.addLast(500);
        k.addLast(3);
        k.addLast(4);
        k.addLast(-5);
        System.out.println(k.contain(9));
        System.out.println(k.size());
        k.printElements();
        System.out.println(k.max());
        System.out.println(k.min());


    }
}