// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        tree t = new tree();
        t.insert(5);
        t.insert(8);
        t.insert(6);
        t.insert(9);
        t.insert(3);
        t.insert(4);
        t.insert(2);
        System.out.println(t.max());
        System.out.println("---------------------------------------------");
        System.out.println(t.min());
        System.out.println("---------------------------------------------");
        System.out.println(t.exist(3));
        System.out.println("---------------------------------------------");
        System.out.println(t.exist(1));
        System.out.println("---------------------------------------------");
        t.preorder();
        System.out.println("---------------------------------------------");
        t.inorder();
        System.out.println("---------------------------------------------");
        t.postorder();
        System.out.println("---------------------------------------------");
    }
}