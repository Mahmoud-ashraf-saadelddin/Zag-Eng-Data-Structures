public class Main {
    public static void main(String[] args) {
        DynamicArray x = new DynamicArray(5);
        x.insert(1);
        x.insert(2);
        x.insert(55);
        x.insert(4);
        x.insert(5);
        x.printArray();
        System.out.println(x.at(2));
        System.out.println(x.max());
        System.out.println(x.min());
        x.remove(55);
        System.out.println(x.indexOfElement(5));
        x.printArray();


    }

}
