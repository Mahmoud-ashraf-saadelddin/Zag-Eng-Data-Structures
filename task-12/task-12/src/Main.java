public class Main {
    public static void main(String[] args) {
        tree t = new tree();
        tree t2 = new tree();
        tree t3 = new tree();
        t.insert(5);
        t.insert(8);
        t.insert(6);
        t.insert(9);
        t.insert(3);
        t.insert(4);
        t.insert(2);
//  ###################################################
        t2.insert(5);
        t2.insert(8);
        t2.insert(6);
        t2.insert(9);
        t2.insert(3);
        t2.insert(4);
        t2.insert(2);
//  ###################################################
        t3.insert(0);
        t3.insert(99);
        t3.insert(6);
        t3.insert(9);
        t3.insert(3);
        t3.insert(4);
        t3.insert(2);
//  ###################################################
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
        System.out.println(t.height());
        System.out.println("---------------------------------------------");
        System.out.println(t.equals(t2));
        System.out.println("---------------------------------------------");
        System.out.println(t2.equals(t3));
        System.out.println("---------------------------------------------");
        System.out.println(t.kthElementFromRoot(2));
        System.out.println("---------------------------------------------");
        t.levelOrder();

    }
}