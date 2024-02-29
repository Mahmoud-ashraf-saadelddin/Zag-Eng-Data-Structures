//import java.util.ArrayList;
//import java.util.NoSuchElementException;
//
//import static java.util.logging.Logger.global;
//
//public class HashLinear {
//    private class Node {
//        private int key;
//        private String value;
//
//        Node(int key, String value) {
//            this.key = key;
//            this.value = value;
//        }
//
//    }
//
//    private int counter = 0;
//
//    public int size() {
//        return counter;
//
//    }
//
//    private ArrayList<Node> table ;
//
//    public HashLinear(int size) {
//         int c = size;
//        table=new ArrayList<>(size);
//    }
//
//    private int Hash(int key) {
//        return key % (c);
//    }
//
//    public void put(int key, String value) {
//        Node node = new Node(key, value);
//        int index = Hash(key);
//        if (table.get(index) == null) {
//            table.set(index, node);
//            counter++;
//        } else {
//            for (int i = index; i < table.size(); i++) {
//                if (table.get(i) == null) {
//                    table.set(i, node);
//                }
//            }
//            counter++;
//        }
//    }
//
//    public String get(int key) {
//        int index = Hash(key);
//        if (table.contains(index)) {
//            return table.get(index).value;
//        } else return "there is no value";
////        if (table.get(index) == null) {
////            return "there is no value";
////        } else {
////            for (int i = index; i < table.size(); i++) {
////                if (table.get(i).key == key) {
////                    return table.get(i).value;
////                }
////            }
////        }
////        return null;
//    }
//
//    public void remove(int key) {
//        int index = Hash(key);
//        if (table.get(index) == null)
//            throw new NoSuchElementException();
//        if (table.contains(index)) {
//            table.remove(index);
//            counter--;
//        }
//    }
//
//}
